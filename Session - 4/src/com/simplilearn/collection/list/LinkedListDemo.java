package com.simplilearn.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		Integer array[] = {10,20,50,80,80};
		Collections.addAll(list, array);
		
//		list.add(10);
//		list.add(20);
//		list.add(50);
//		list.add(80);
//		list.add(90);
		
		System.out.println(list);
		list.remove(3);
		System.out.println("List after remove :"+ list);
		System.out.println("List Size :"+ list.size());
		System.out.println("Check if list contains 50 :"+ list.contains(50));
		
		System.out.println("Iterate using for each loop");
		for(int num : list) 
			System.out.println(num);
		//to print data we have Iterator Interface in Collection
		System.out.println("Using Iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}		

	}

}
