package com.example.perfromance._2;

public class Main {

	static int USER_COUNT = 5000;

	public Main() throws Exception {

		System.out.println("Start Line!!!");

		for (int i = 0; i < USER_COUNT; i++) {
			Thread threadA = new Thread(new Mathmatecian(i), "Mathematcian-" + i);
			threadA.start();
		}

		System.out.println("Finish Line!!!");
		System.in.read();
	}

	public static void main(String[] args) throws Exception {
		new Main();
	}


class Mathmatecian implements Runnable {

	int user = 0;

	public Mathmatecian(int user) {
		this.user = user;
	}

	
	public void run() {

		CalculatorService calculatorService = new CalculatorService();

		calculatorService.doSum(10, 3);
		calculatorService.doDiff(10, 3);

		calculatorService = null;
	}

}

}
