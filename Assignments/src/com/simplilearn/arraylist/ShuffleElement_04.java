package com.simplilearn.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElement_04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sowmya");
		list.add("Blessy");
		list.add("Neeraja");
		list.add("Sindhu");
		
		Collections.shuffle(list);
		System.out.println("Shuffle is :" + list);	

	}

}
