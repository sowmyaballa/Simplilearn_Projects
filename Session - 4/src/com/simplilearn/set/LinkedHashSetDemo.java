package com.simplilearn.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		set.add("sowmya");
		set.add("blessy");
		set.add("neeraja");
		set.add("lahari");
		
		System.out.println(set);
		set.remove("lahari");
		System.out.println("After remove :"+ set);
		System.out.println("Set contains or not :"+set.contains("sowmya"));
		System.out.println("Size :" + set.size());

		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println("Using Iteartor : "+it.next());
		}	
	}

}
