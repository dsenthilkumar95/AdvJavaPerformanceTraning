package com.example.oom;

import java.util.ArrayList;
import java.util.List;

public class OOMOverHeadLimit {

	List<Person> list = new ArrayList<>();

	public static void main(String args[]) throws Exception {
		new OOMOverHeadLimit();
	}

	public OOMOverHeadLimit() {
		for (;;) {
			Person person = new Person("Raj");
			list.add(new Person("Rohan"));
			person = null;
		}

	}

}

class Person {

	String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name : " + this.name;
	}

}
