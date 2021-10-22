package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListAndCopyArrayListTest {

	List<Integer> arrayList = Collections.synchronizedList(new ArrayList<Integer>());
	CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<Integer>();

	int N = 200000;

	public static void main(String[] s) {
		new ArrayListAndCopyArrayListTest();
	}

	public ArrayListAndCopyArrayListTest() {
		testWriting();
		//testReading();
	}

	public void testWriting() {

		for (int i = 0; i < 5; i++) {
			new Thread(() -> {
				addIntoArrayList();
			}).start();
		}

		for (int i = 0; i < 5; i++) {
			new Thread(() -> {
				addIntoCopyArrayList();
			}).start();
		}
	}

	public void testReading() {

		for (int i = 0; i < 5; i++) {
			new Thread(() -> {
				readFromArrayList();
			}).start();
		}

		for (int i = 0; i < 5; i++) {
			new Thread(() -> {
				readFromCopyArrayList();
			}).start();
		}
	}

	public void addIntoArrayList() {

		for (int i = 0; i < N; i++) {
			arrayList.add(i);
		}
		System.out.println("ArrayList additions Done");
	}

	public void addIntoCopyArrayList() {

		for (int i = 0; i < N; i++) {
			copyOnWriteArrayList.add(i);
		}
		System.out.println("CopyOnWriteArrayList additions Done");
	}

	public void readFromArrayList() {
			
		arrayList.forEach((value)-> System.out.println(value));
		System.out.println("ArrayList read Done");
	}

	public void readFromCopyArrayList() {
		copyOnWriteArrayList.forEach((value)-> System.out.println(value));
		System.out.println("CopyOnWriteArrayList read Done");
	}

}