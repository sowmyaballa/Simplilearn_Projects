package com.simplilearn.arraylist;

import java.util.ArrayList;

public class PrintUsingPosition_12 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sowmya");
		list.add("Blessy");
		list.add("Neeraja");
		list.add("Sindhu");
		
		System.out.println("Using index :");
		for(int i =0 ; i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
