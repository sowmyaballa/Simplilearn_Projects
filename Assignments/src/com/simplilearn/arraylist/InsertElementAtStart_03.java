package com.simplilearn.arraylist;

import java.util.ArrayList;
import java.util.List;

public class InsertElementAtStart_03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sowmya");
		list.add("Blessy");
		list.add("Neeraja");
		list.add("Sindhu");
		
		System.out.println("Original array is :" + list);		
		list.add(0, "Lahari");
		System.out.println("Adding element at start :" + list);
		

	}

}
