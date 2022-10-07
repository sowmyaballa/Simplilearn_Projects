package com.simplilearn.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElements_06 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sowmya");
		list.add("Blessy");
		list.add("Neeraja");
		list.add("Sindhu");
		
		System.out.println("Original array :");
		for(String ele : list) {
			System.out.println(ele);
		}
		
		Collections.swap(list, 0, 2);
		System.out.println("After swapping :");
		for(String s : list ) {
			System.out.println(s);
		}

	}

}
