package com.simplilearn.array;

import java.util.Scanner;

public class SingleDimenArray {
	public static void main(String[] args) {
		int a[] = {10,30,40,50};
		String name[] = {"sowmya", "blessy", "lahari"};
		
		int c[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < a.length; i++) {
			System.out.println("Enter numbers:");
			c[i]= sc.nextInt();
		}
		 System.out.println("Printing array elements :");
		 for(int n: c) {
			 System.out.println(n);
		 }
		 
		System.out.println("Array Length :" + a.length);
		System.out.println("Array Length :" + name.length);
		
		System.out.println(a[2]);
		System.out.println(name[2]);
		System.out.println("For Loop");
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
			
		System.out.println("For Each Loop");
		for(String s: name) {
			System.out.println(s);
		}
	}

}
