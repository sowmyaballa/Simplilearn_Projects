package com.simplilearn.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String regex = ("(0|91)?[7-9][0-9]{9}");
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if(matcher.matches()) 
			System.out.println("Pattern matched");
		else 
			System.out.println("Not matched");
		sc.close();
	}
		
}
