package com.example.oom;

import java.util.concurrent.TimeUnit;

public class OOMExample {

	public static void main(String args[]) throws Exception {

		for (;;) {
			Employee emp = new Employee("Rohan");
			System.out.println(emp);
			emp = null;
		}

	}

}

class Employee {

	String name;

	public Employee(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name : " + this.name;
	}

	@Override
	protected void finalize() {
		System.out.println("Employee is being finalized!!");
		//Long running cleanup process
		try {
			TimeUnit.MILLISECONDS.sleep(600); //Simulating finalizer thread will become slow
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
