package com.simplilearn.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll_08 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sowmya");
		list.add("Blessy");
		list.add("Neeraja");
		list.add("Sindhu");
		
		list.removeAll(list);
	//	list.clear();
		System.out.println(list);

	}

}
