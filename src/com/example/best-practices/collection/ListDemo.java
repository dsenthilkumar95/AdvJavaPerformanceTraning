package com.example.collection;
import java.util.*;

public class ListDemo{

	public static void main(String[] s){
		
		List list = new ArrayList();
		list.add(200);
		list.add(500);
		list.add(600);
		list.add(100);
		list.add(300);
		list.add(400);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.fill(list,290);
		System.out.println(list);
		
		List lst = Collections.unmodifiableList(list);
		System.out.println(lst);
		//lst.add(10000);
				
		
	}
	
	
}