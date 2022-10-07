package com.simplilearn.filesex;

import java.io.File;
import java.util.Scanner;

public class SearchFile {

	public static void main(String[] args) {
		String path="D:\\files\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file in the directory of "+path);
		String filename=sc.next();
		//File
		File f=new File(path);
		File filenames[]=f.listFiles();
		int flag=0;
		for(File ff: filenames) {
			if(ff.getName().equals(filename)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		
		if(flag==1) {
			System.out.println("the file is found");
		}
		else {
			System.out.println("file is not found");
		}
		
		
	}
	}


	
