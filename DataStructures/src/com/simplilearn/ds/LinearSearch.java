package com.simplilearn.ds;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= {2,3,4,1,9,14,61};
		Arrays.sort(a);
		System.out.println("Elements in array:");
		for(int value:a) {
			System.out.println(value);
		}
		System.out.println("Enter key value");
		int key = sc.nextInt();
		int flag =0;
		int position =0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				position =i;
				flag = 1;
				break;
			}
			else {
				flag =0;
			}
			
		}
		if(flag==1) {
			System.out.println("Element is found at " +position+"position");
		}
		else {
			System.out.println("Element is not found");
		}

	}

}
