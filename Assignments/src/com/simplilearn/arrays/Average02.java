package com.simplilearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Average02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];		
		int i;
		double sum =0;
		double average;
		System.out.println("Enter array elements");
		for(i=0;i<n;i++) {			
			arr[i]=sc.nextInt();
		}
		
		for(int a :arr) {
			System.out.println(a);
		}
		
		for(i=0;i<n;i++) {
			sum = sum +arr[i];
		}
		System.out.println("sum:"+(int)sum);
		System.out.println("Average :" + (sum/n));

	}

}
