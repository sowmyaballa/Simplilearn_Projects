package com.simplilearn.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(1, "Sowmya");
		hm.put(2, "Blessy");
		hm.put(3, "Neeraja");
		hm.put(4, "Lahari");

		System.out.println("\n Elements of HashTable are :");
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
