package com.simplilearn.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray09 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(8);
		list.add(5);
		
		Integer[] arr = list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(arr));

	}

}
