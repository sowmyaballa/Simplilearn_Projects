package com.simplilearn.array;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a = new int[5];
	//	int[] a1 = new int[n];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println("Using for loop");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\nUsing for each loop");
		for(int i:a) {
			System.out.print(i+ " ");
		}

	}

}
