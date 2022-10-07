package com.simplilearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateVal04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i, j;
		
		System.out.println("Enter array elements");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Numerical array is :" + Arrays.toString(arr));

		for (i = 0; i < n; i++) {
			int c = 1;
			for (j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate value is :" + arr[i]);
					c++;

				} 
			}
			if (c > 1) {
				System.out.println(arr[i] + " " + "occurs" + c + " times");
				

			}

		}
	}
}
