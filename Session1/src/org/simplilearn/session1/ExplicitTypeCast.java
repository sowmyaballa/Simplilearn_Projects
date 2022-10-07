package org.simplilearn.session1;

public class ExplicitTypeCast {
	public static void main(String[] args) {
		int a = 10;
		byte b = (byte) a; //covert forcefully
		
		System.out.println("int:"+ a);
		System.out.println("byte:"+ b);
		
		double d = 20.78;
		int i =(int) d;
		System.out.println("double:" + d);
		System.out.println("integer:" +i);
		
	}

}
