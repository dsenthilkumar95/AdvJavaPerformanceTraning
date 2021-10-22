package com.example.oom;

import java.util.concurrent.TimeUnit;

//Reason stack_trace_with_native_method
public class NativeMethod {

	public static void main(String args[]) throws Exception {

		while (true) {
			new Thread(new Task()).start();
		}

	}

	static class Task implements Runnable {

		@Override
		public void run() {
			System.out.println("Task Started!!!");
			try {
				TimeUnit.MINUTES.sleep(10); // Simulating long running task
			} catch (InterruptedException e) {
			}
			System.out.println("Task Finished!!!");
		}

	}

}
