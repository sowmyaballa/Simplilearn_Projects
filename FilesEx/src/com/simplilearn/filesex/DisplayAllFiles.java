package com.simplilearn.filesex;

import java.io.File;
import java.util.Scanner;

public class DisplayAllFiles {

	//these files are always displayed in ascending order
	public static void main(String[] args) {
		String path = "D:\\Files\\";

		Scanner sc = new Scanner(System.in);
//			System.out.println("enter the file in the directory of "+path);
//			String filename=sc.next();
		// File
		File f = new File(path);
		File filenames[] = f.listFiles();
		for (File ff : filenames) {
			System.out.println(ff.getName());
		}

	}
}
