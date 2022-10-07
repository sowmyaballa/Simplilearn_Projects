package org.simplilearn.session1;

import java.util.Scanner;

public class ElseIfDemo {
	public static void main(String[] args) {
		int percent;
		Scanner sc = new Scanner(System.in);
		percent = sc.nextInt();
		System.out.println("Enter percent");
		if( percent >= 70) {
			System.out.println("Distinction");
		}
		else if(percent >= 60 && percent <70) {
			System.out.println("First class");
		}
		else {
			System.out.println("Enter valid result");
		}
		
	}

}
