package com.example.memory.leak.small.objects;


import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class OrderService {

	public String placeOrder(String customerId,Collection<Product> products) {
		// 20 JDBC loc
		String orderID = "O"
				+ ((System.nanoTime() * Runtime.getRuntime().freeMemory()) + Runtime
						.getRuntime().availableProcessors());
		System.out.printf("Order for customer %s is placed for and Order Id : %s%n", customerId,orderID);
		try {
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderID;
	}

}
