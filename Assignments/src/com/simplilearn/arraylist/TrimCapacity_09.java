package com.simplilearn.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TrimCapacity_09 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sowmya");
		list.add("Blessy");
		list.add("Neeraja");
		list.add("Sindhu");
		
		list.trimToSize();
		System.out.println(list);

	}

}
