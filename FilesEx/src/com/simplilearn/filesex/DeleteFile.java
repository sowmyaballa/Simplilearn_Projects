package com.simplilearn.filesex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {

	public static void main(String[] args) throws IOException {
		String path = "D:\\Files\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file in the directory of" + path);
		String filename = sc.next();
		// file
		File f = new File(path + filename);
		//delete a file
		boolean b=f.delete();
		if(b==true) {
			System.out.println("file has been deleted");
		}
		else {
			System.out.println("file is not found/ cannot be deleted  ");
		}
		
	}

}
