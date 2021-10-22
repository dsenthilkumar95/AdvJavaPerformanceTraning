package com.example.memory.leak.small.objects;

import java.util.Random;

public class Main {

	static int USER_COUNT = 2000;

	static CalculatorService[] calculatorServiceArray = new CalculatorService[USER_COUNT];
	
	static ShoppingCartService[] shoppingCartServiceArray = new ShoppingCartService[USER_COUNT];
	static OrderService[] orderServiceArray = new OrderService[USER_COUNT];

	public Main() throws Exception {

		for (int i = 0; i < USER_COUNT; i++) {
			Thread threadA = new Thread(new Mathmatecian(i), "Mathematcian-" + i);
			threadA.start();

			Random random = new Random();
			
			try {
				Thread.sleep(random.nextInt(60));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Thread threadB = new Thread(new Shopper(i), "HighShopper-" + i);
			threadB.start();
		}

		System.out.println("Finish Line!!!");
		System.in.read();
	}

	public static void main(String[] args) throws Exception {
		new Main();
	}

class Shopper implements Runnable {

	int user = 0;

	public Shopper(int user) {
		this.user = user;
	}

	public void run() {

		ShoppingCartService shoppingCartService = new ShoppingCartService();
		OrderService orderService = new OrderService();
		
		shoppingCartServiceArray[user] = shoppingCartService;
		orderServiceArray[user] = orderService;

		Product p1 = new Product(100, "Nano", 1000000.00, 1);
		Product p2 = new Product(101, "Audi", 1450000.00, 1);
		Product p3 = new Product(102, "BMW", 7800000.00, 1);

		shoppingCartService.addItem(p1);
		shoppingCartService.addItem(p1);
		shoppingCartService.addItem(p1);
		shoppingCartService.addItem(p2);
		shoppingCartService.addItem(p2);
		shoppingCartService.addItem(p3);

		System.out.println(shoppingCartService.totalPrice());

		shoppingCartService.addItem(p2);
		shoppingCartService.addItem(p3);

		System.out.println(shoppingCartService.totalPrice());

		try {
			shoppingCartService.removeItem(102);
			System.out.println(shoppingCartService.totalPrice());
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(shoppingCartService.countItems());

		orderService.placeOrder("ritesh", shoppingCartService.showCartDetails());

		shoppingCartService.emptyCart();

		System.out.println(shoppingCartService.countItems());

		shoppingCartService = null;
		orderService = null;
		shoppingCartServiceArray[user] = null;
		orderServiceArray[user] = null;
		
		Random random = new Random();
		
		try {
			Thread.sleep(random.nextInt(5000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Mathmatecian implements Runnable {

	int user = 0;

	public Mathmatecian(int user) {
		this.user = user;
	}

	
	public void run() {

		CalculatorService calculatorService = new CalculatorService();
		
		calculatorServiceArray[user] = calculatorService;

		calculatorService.doSum(10, 3);
		calculatorService.doDiff(10, 3);

		calculatorService = null;
		calculatorServiceArray[user] = null;
		
		Random random = new Random();
		
		try {
			Thread.sleep(random.nextInt(4000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

}
