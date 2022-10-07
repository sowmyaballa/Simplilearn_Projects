package com.simplilearn.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Sowmya");
		hm.put(2,  "Blessy");
		hm.put(3,  "Neeraja");
		hm.put(4, "Lahari");
		
		System.out.println("\n Elements of HashMap are :");
		
	System.out.println(hm);
	
	System.out.println("Using for each");
	
	for(Map.Entry m : hm.entrySet()) {
		System.out.println(m.getKey() +" " +m.getValue());
	}

	}

}
