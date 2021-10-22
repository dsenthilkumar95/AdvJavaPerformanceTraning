package com.example.memory.leak.small.objects;

public class ItemNotFoundException extends Exception {

	public ItemNotFoundException() {

	}

	public ItemNotFoundException(String message) {
		super(message);
	}
}
