package com.simplilearn.array;

import java.util.Scanner;

public class ArrayDemo02 {

	public static void main(String[] args) {
		System.out.println("Enter no of subjects");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] marks = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter subject "+(i+1)+" marks:");
			marks[i] = sc.nextInt();
		}
		
		System.out.println("Displaying marks ");
		for(int i:marks) {
			System.out.print(i+ " ");
		}

	}

}
