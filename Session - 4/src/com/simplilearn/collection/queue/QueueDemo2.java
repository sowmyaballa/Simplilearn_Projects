package com.simplilearn.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		//it will just give first element
		System.out.println(queue.peek());
		//it will give you the first element as well as remove from queue
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println("Using Iteartor : "+it.next());
		}	
	}
		
}


