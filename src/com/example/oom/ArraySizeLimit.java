package com.example.oom;

import java.util.Random;
import java.util.concurrent.TimeUnit;

//-Xms512m -Xmx512m
//Requested array size exceeds VM limit
public class ArraySizeLimit {

	public static void main(String args[]) throws Exception {

		UC1();

		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		UC2();

		System.out.println("Done!!");
	}


	private static void UC1() {
		for (int idx = 0; idx < 200; idx++) {
			new String("Enjoy");
			System.out.println("Generating object.....");
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void UC2() {
		Integer[] array = new Integer[Integer.MAX_VALUE];
		System.out.println("Generating array.....");
		for (int idx = 0; idx < Integer.MAX_VALUE; idx++) {
			array[idx] = (new Random()).nextInt();
		}
	}

}
