package com.example.memory.leak;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LeakExample4 {

	public static void main(String args[]) throws Exception {

		Map<Product,String> map = new HashMap<>();
		int count = 1;
		
		for (; true;) {
			Product product = new Product("Lenovo Laptop",(int)(Math.random() * count));
			map.put(product, "****");
			//System.out.println(product.hashCode());
			//TimeUnit.MILLISECONDS.sleep(200);
			count++;
		}
		
	}

}

class Product {

	public final String title;
	public final int qty;

	public Product() {
		this.title = "";
		this.qty = 0;
	}
	
	public Product(String title, int qty) {
		this.title = title;
		this.qty = qty;
	}

	@Override
	public int hashCode() {
		return this.qty;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Product) {
			Product otherProduct = (Product) other;
			return otherProduct.title.equals(this.title) && otherProduct.qty == this.qty;
		}
		return false;
	}

}
