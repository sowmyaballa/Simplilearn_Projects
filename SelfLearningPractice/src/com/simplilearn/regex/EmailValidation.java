package com.simplilearn.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		String regex =("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)");
		Pattern p= Pattern.compile(regex);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		boolean flag = false;
		String[] str=new String[n];	
		   for(int i=0;i<n;i++)			   
		   {
		   System.out.println("enter any email id:");
		   str[i]=sc.next();
		   }
		   
		   System.out.println("Enter email id you want to search");
		   String input = sc.next();
		   Matcher m=p.matcher(input);
			for(String s:str) {
				if(s.equals(input))
					flag = true;
					break;
			}
			if(m.matches() && flag)
				System.out.println("enter email id is valid:");
			else
				System.out.println("enter  email id is invalid:");
	   }
          
	}
