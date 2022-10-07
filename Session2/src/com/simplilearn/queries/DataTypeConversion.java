package com.simplilearn.queries;

import java.util.Scanner;

public class DataTypeConversion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = sc.nextInt();
		
		float f = a; //Implicit Type Casting(
		System.out.println("Float conversion :" +f);
		
		sc.close();
		char c = (char)a; //Explicit type casting
		System.out.println("Char conversion :" +c);
		
	}

}
