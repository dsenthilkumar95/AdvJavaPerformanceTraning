package com.example.oom;

import java.util.ArrayList;
import java.util.ListIterator;

public class OutOfMemoryExample {

	 public static void main(String args[]) {
	      ArrayList<String> list = new ArrayList<String>();
	      list.add("Pen");
	      list.add("Penicl");
	      ListIterator<String> it = list.listIterator();
	      while(it.hasNext()) {
	         it.add("");
	      }
	   }
}
