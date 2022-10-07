package com.simplilearn.method;

public class StaticMethod {
	public static void test() {
		System.out.println("Static called");
	}
	public static void main(String[] args) {
		
		//Static method can be called directly without creating object 
		//className.methodname
		StaticMethod.test();
	}

}
