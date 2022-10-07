package com.simplilearn.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray01 {

	public static void main(String[] args) {
		String[] str = {"sowmya", "neeraja", "blessy", "lahari", "priya"};
		int[] arr = {1789, 2035, 1899, 1456, 2013};
		
		System.out.println("Numerical array is :" +Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorting of elements are :"+ Arrays.toString(arr));
		
		System.out.println("String elements are :"+ Arrays.toString(str));
		List<String> list1 = Arrays.asList(str);
		Collections.sort(list1);
		System.out.println("Sorting of string :"+ list1);
			

	}

}
