package com.simplilearn.methods;

import java.util.Scanner;

public class SmallestNumber_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();
		
		System.out.println("Smallest number is :" + smallest(a,b,c) );		

	}

	public static int smallest(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

}
