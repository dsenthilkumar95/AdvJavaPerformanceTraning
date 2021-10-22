package com.example.memory.leak.small.objects;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ShoppingCartService {

	Map<Long, Product> cart = null;

	public ShoppingCartService() {
		cart = new HashMap<>();
	}

	public void addItem(Product product) {
		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (cart.containsKey(product.getId())) {
			Product selectedProduct = cart.get(product.getId());
			selectedProduct.setQty(selectedProduct.getQty() + 1);
		} else {
			cart.put(product.getId(), product);
		}
	}

	public int countItems() {
		int quantity = 0;
		Collection<Product> products = cart.values();
		for (Product product : products) {
			quantity = quantity + product.getQty();
		}
		return quantity;
	}

	public void removeItem(long orderId) throws ItemNotFoundException {
		if (cart.containsKey(orderId)) {
			cart.remove(orderId);
		} else {
			throw new ItemNotFoundException(
					"Cart does not have product with id : " + orderId);
		}
	}

	public double totalPrice() {
		double total = 0.0;
		final Collection<Product> products = cart.values();
		for (final Product product : products) {
			double temp = product.getPrice() * product.getQty();
			total = total + temp;
		}
		return total;
	}

	public Collection<Product> showCartDetails() {
		return cart.values();
	}


	public void emptyCart() {
		cart.clear();
	}

}
