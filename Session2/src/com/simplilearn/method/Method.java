package com.simplilearn.method;

public class Method {
	//void methods
	public void print() {
		System.out.println("Hello");		
	}
	
	public void calculate(int a, int b) {
		System.out.println("Calculation is :" + (a+b));
	}
	
	public void fullname(String fname, String lname, String mname)
	{
		System.out.println("Full Name is : "+ fname + lname + mname);
	}
	
	//return methods
	public String greeting() {
		return "GoodMorning";
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public float cube(float n) {
		return n*n*n;
	}
	
	public static void main(String args[]) {
		Method m = new Method();
		m.print();
		m.calculate(5,8);		
		m.fullname("Yamini", "Sowmya", "Lakshmi");
		System.out.println("Addition is:"+m.add(2, 2));
		System.out.println("Cube of 6 is:"+m.cube(6));
		
	}

}
