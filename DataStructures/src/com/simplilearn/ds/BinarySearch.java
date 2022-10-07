package com.simplilearn.ds;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

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
		
		/*
		 * find mid =(low+high)/2;
		 * if a[mid] == key value return the location 
		 * if a[mid]>key ==>high = mid-1 
		 * if a[mid]<key ==>low = mid+1
		 */
		
		int low =0;
		int high = a.length-1;
		int mid=0;
		int flag =0;
		while(low<=high) {
			mid=(low+high)/2;
			if(a[mid]==key) {
				flag = 1;
				break;				
			}
			else if(a[mid]<key)
			{
				low=mid+1;
			}
			else {
				high = mid-1;
			}
		}
		if(flag==1) {
			System.out.println("Key is found at"+mid+"position");
		}
		else {
			System.out.println("Element not found");
		}

	}

}
