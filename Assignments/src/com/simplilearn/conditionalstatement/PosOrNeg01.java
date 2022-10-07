package com.simplilearn.conditionalstatement;

import java.util.Scanner;

public class PosOrNeg01 {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}

	}

}
