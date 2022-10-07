package com.simplilearn.interfaceex;

public class EnterpriseCustomer extends Customer {
	String customerId;
	String customerName;
	String customerType;
	double amount;

	public EnterpriseCustomer(String customerId, String customerName, String customerType, double amount) {
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
		
		//500 rs discount for all Enterprise Customers
		amount = amount - 500;
		if(this.customerType == "Smallscale") {
			return amount - 100;
		}
		else if(this.customerType == "Bigscale") {
			return amount;
		}
		return amount;
	}

}
