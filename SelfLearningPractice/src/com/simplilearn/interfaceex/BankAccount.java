package com.simplilearn.interfaceex;

public class BankAccount {
	public static void main(String[] args) {
		RegularCustomer regCustomer1 = new RegularCustomer("R123", "Sowmya", "Domestic", 1000);
		RegularCustomer regCustomer2 = new RegularCustomer("R345", "Blessy", "Business", 1000);
		
		EnterpriseCustomer entCustomer1 = new EnterpriseCustomer("E123", "Lahari", "Smallscale", 12000);
		EnterpriseCustomer entCustomer2 = new EnterpriseCustomer("E345", "Neeraja", "Bigscale", 14000);
		
		//RegularCustomer
		regCustomer1.showCustomerDetails();
		System.out.println("Final amount :" + regCustomer1.get_final_amount(5,8));
		regCustomer2.showCustomerDetails();
		System.out.println("Final amount :" + regCustomer1.get_final_amount(5,8));
		
		//EnterpriseCustomer
		entCustomer1.showCustomerDetails();
		System.out.println("Final amount :" + entCustomer1.get_final_amount(1,3));
		entCustomer2.showCustomerDetails();
		System.out.println("Final amount :" + entCustomer2.get_final_amount(5,8));
	}

}
