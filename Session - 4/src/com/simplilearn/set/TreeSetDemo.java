package com.simplilearn.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<>();
		set.add("sowmya");
		set.add("blessy");
		set.add("neeraja");
		set.add("lahari");
		
		System.out.println(set);
		set.remove("lahari");
		System.out.println("After remove :"+ set);
		System.out.println("Set contains or not :"+set.contains("sowmya"));
		System.out.println("Size :" + set.size());
		
		SortedSet<String> desc = ((TreeSet<String>) set).descendingSet();
		System.out.println("Descending order :" + desc);

		//iterators re not reusable, create fresh iterator to use
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println("Using Iteartor : "+it.next());
		}	
	}

}
