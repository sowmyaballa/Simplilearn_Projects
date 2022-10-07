package com.simplilearn.queries;

public class Employee {
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		//class level variable = local variable
		//class level variable needs to give by using this keyword
		this.id = id;
		this.name = name;
	}
	public void display() {
		System.out.println("Id :" +id);
		System.out.println("Name:" +name);
	}

	public static void main(String[] args) {
		Employee e1= new Employee(1, "Sowmya");
		Employee e2= new Employee(2, "Swathi");
		e1.display();
		e2.display();
		
	}
}
