package com.simplilearn.inheritance;

public class ClassB extends ClassA {

	public ClassB() {
		super(10);
		System.out.println("Child class Constructor");
	}

	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		b.print(); //child can access properties and behavior of parent
	}
}
