package com.simplilearn.constructor;

public class Employee {
	
	private int id;
	private String email;
	private String name;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(int id, String name, String email) {
		this.id = id;
		this.email = email;
		this.name = name;		
	}
	
	public void printData( ) {
		System.out.println("Id:" + id);
		System.out.println("Email is :" + email);
		System.out.println("Name is:" + name);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "sowmyaballa@gmail.com", "Sowmya");
		Employee e2 = new Employee(2, "blessy@gmail.com", "Blessy");
		Employee e3 = new Employee();
		e1.printData();
		e2.printData();
		e3.printData();		
	}

}
