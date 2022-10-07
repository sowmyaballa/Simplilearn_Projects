package com.simplilearn.array;

public class MultiDimenArray {

	public static void main(String[] args) {
		int array[][] = {{1,2,3},{4,5,6}};
		
		System.out.println("Direct access :" + array[1][2]);
		
		for(int row=0; row<2; row++) {
			for(int col=0; col<3; col++) {
				System.out.println(array[row][col]+ "\t");
			}
			System.out.println();
		}

		System.out.println("For Each loop");
		for(int a[]:array) {
		for(int x:a) 
			System.out.print(x+"\t");
			
		System.out.println();
		}		
		
	}

}
