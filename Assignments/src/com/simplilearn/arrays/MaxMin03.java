package com.simplilearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i;
		System.out.println("Enter array elements");
		for(i=0;i<n;i++) {			
			arr[i]=sc.nextInt();
		}
				
		System.out.println("Numerical array is :" +Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorting of elements are :"+ Arrays.toString(arr));
		
		System.out.println("max element :" + arr[(arr.length-1)]);
		System.out.println("min element :" + arr[0]);
		
		

	}

}
