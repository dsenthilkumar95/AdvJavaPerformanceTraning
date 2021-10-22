package com.example.method.calls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MethodCallsTest {

	int N = 200000;
	List<Integer> list = new ArrayList<>();

	public static void main(String[] s) {
		new MethodCallsTest();
	}

	public MethodCallsTest() {

		/*new Thread(() -> {
			populate();
			shuffle();
			reverse();
			sort();
			show();
		}).start();
		 */
		
		new Thread(() -> {
			doTask();
		}).start();
	}
	
	public void populate() {
		for (int i = 0; i < N; i++) {
			list.add(1000 + i);
		}
		System.out.println("Population Done!!");
	}

	public void shuffle() {
		Collections.shuffle(list);
		System.out.println("Shuffle Done!!");
	}

	public void reverse() {
		Collections.reverse(list);
		System.out.println("Reverse Done!!");
	}

	public void sort() {
		Collections.sort(list);
		System.out.println("Sort Done!!");
	}

	public void show() {
		list.forEach(System.out::println);
	}

	public void doTask() {
		for (int i = 0; i < N; i++) {
			list.add(1000 + i);
		}
		System.out.println("Population Done!!");
		Collections.shuffle(list);
		System.out.println("Shuffle Done!!");
		Collections.reverse(list);
		System.out.println("Reverse Done!!");
		Collections.sort(list);
		System.out.println("Sort Done!!");
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}