package com.simplilearn.session2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String[] email = {"sowmyaballa1098@gmail.com", "blessy@gmail.com", "neeraja@gmail.com", "venu@gmail.com", "lahari@gmail.com", "sindhu@gmail.com", "sowji@gmail.com",
				"likitha@gmail.com", "siri@gmail.com", "bob#gmail.com", "john@gmail"};
		
		//to print all the strings present in array
		System.out.println("Available Email ID's are : "+ Arrays.toString(email));
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		int index = 0;
				
		System.out.println("Enter your Email ID :");
		String input = sc.next();
		
		//searches for this regular expression
		String regex = ("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Pattern pattern = Pattern.compile(regex);
		boolean result = input.matches(regex);
		
		for(String e : email) {
		if(e.equalsIgnoreCase(input)) {
			flag = true;
			break;
		}
		}
		
		//if email id is present and matches with regex pattern
		if(flag && result) {
		System.out.println("Your Email Id is valid !!");
		}
		
		//if entered invalid email but present in string of arrays
		else if(flag && !result){
			System.out.println("Your Email Id is not valid. Please enter correct email ID ");
		}
		
		//if string is not found in array
		else {
			System.out.println("Your Email Id is not present ");
		}
	}
}

