package com.simplilearn.methods;

import java.util.Scanner;

public class Average_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();
		
		System.out.println("Average is :" + average(a,b,c) );		

	}

	public static int average(int a, int b, int c) {
		return (a+b+c)/3;
	}


	}

