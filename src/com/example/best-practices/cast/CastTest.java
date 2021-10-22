package com.example.cast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CastTest {

	List list = new ArrayList();
	List<Integer> arrayList = new ArrayList<Integer>();

	int N = 5000000;

	public static void main(String[] s) {
		new CastTest();
	}

	public CastTest() {
		testCasting();
		testNoCasting();
	}

	public void testCasting() {
		long total = 0;
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			int value = (Integer) iterator.next();
			total = total + value;
		}

		System.out.println("List Total : " + total);

	}

	public void testNoCasting() {
		long total = 0;
		for (int i = 1; i <= N; i++) {
			arrayList.add(i);
		}

		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			total = total + value;
		}

		System.out.println("ArrayList Total : " + total);

	}

}