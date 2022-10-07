package org.simplilearn.session1;

public class ImplicitTypeCasting1 {
	public static void main(String[] args) {
		byte a = 10;
		short b = a; //covert byte to short
		int c= b; //convert short to int
		long d = c; //convert int to long
		float e = d; //convert long to float
		double f = e; //convert flost to double
		
		System.out.println("Byte "+ a);
		System.out.println("Long "+ c);
		
		
	}

}
