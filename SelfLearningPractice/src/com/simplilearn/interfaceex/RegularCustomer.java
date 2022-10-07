package com.simplilearn.interfaceex;

public class RegularCustomer extends Customer {
	String customerId;
	String customerName;
	String customerType;
	double amount;
	
	public RegularCustomer(String customerId, String customerName, String customerType, double amount) {
		super(customerId, customerName, customerType);
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
		this.amount = amount;
	}

	@Override
	double get_final_amount(double interest, int year) {
		double simpleInterest = this.amount * year * year;
		double amount = this.amount + simpleInterest;
		
		//500 rs discount for all Domestic Customers
		amount = amount - 500;
		if(this.customerType == "Domestic") {
			return amount - 500;
		}
		else if(this.customerType == "Business") {
			return amount;
		}
		return amount;
	}

}
	
