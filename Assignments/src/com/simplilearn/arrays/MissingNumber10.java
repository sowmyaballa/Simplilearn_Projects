package com.simplilearn.arrays;

public class MissingNumber10 {

	public static void main(String[] args) {
	
		int num[] = {1,2,3,5};
		int n1 = findMissingNum(num, 5);
		System.out.println("Missing Number : "+ n1);
		}
		

	public static int findMissingNum(int num[], int n) {
		
		int expSum = n*((n+1)/2);
		int actSum = 0;
		
		for(int i : num) {
			actSum +=i;
		}
		
		return expSum-actSum;
	}
}
