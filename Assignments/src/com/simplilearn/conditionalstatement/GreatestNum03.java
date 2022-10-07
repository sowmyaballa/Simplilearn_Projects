package com.simplilearn.conditionalstatement;

import java.util.Scanner;

public class GreatestNum03 {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is bigger :" + a);
		}
		
		else if(b>a && b>c) {
			System.out.println("b is bigger :" + b);
		}
		
		else {
			System.out.println("c is bigger :" + c);
		}

	}

}
