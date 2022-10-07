package com.simplilearn.polymorphism;

public class CheckPolymorphism {

	public static void main(String[] args) {
		HouseArchitecture ha;
		
		ha = new Villas();
		System.out.println("Price of Villas are :"+ String.format("%.0f", ha.getPrice()));
		System.out.println("Banks giving loans are :"+ ha.getLoanbank());
		
		ha = new FarmHouse();
		System.out.println("Price of Farm Houses are :"+ String.format("%.0f", ha.getPrice()));
		System.out.println("Banks giving loans are :"+ ha.getLoanbank());
		
		ha = new Apartments();
		System.out.println("Price of Apartments are :"+ String.format("%.0f", ha.getPrice()));
		System.out.println("Banks giving loans are :"+ ha.getLoanbank());

	}

}
