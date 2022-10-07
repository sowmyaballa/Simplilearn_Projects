package com.simplilearn.arrays;

import java.util.Arrays;

public class SecondMax06 {
	public static void main(String[] args) {
		int arr[] = {2,6,8,9,3};
		
		System.out.println("Array elements :" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorting : "+ Arrays.toString(arr));
		System.out.println("Second largest is :" + arr[arr.length-2]);
	}

}
