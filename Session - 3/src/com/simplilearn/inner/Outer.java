package com.simplilearn.inner;

public class Outer {
	
	private int num = 10;
	
	class Inner {
		int innerVariable = 20;
		
		void display() {
			System.out.println("Inner class Display method called");
			System.out.println("Display :" +innerVariable);
			System.out.println("Can access outer class variables :"+ num);
		}
		class Depth {
			void print( ) {
				System.out.println("Depth class print called");
			}
		}
	}
	
	public static void main(String[] args) {
		//lets create an obj of outer class
		Outer outer = new Outer();
		//lets create an obj of inner class
		Outer.Inner inner = outer.new Inner();
		inner.display();
		Outer.Inner.Depth depth = inner.new Depth();
		depth.print();
	}
	

}
