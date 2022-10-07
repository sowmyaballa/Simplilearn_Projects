package com.simplilearn.serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//serialization
		Student s1 = new Student(1, "Sowmya", "Java");
		FileOutputStream fo = new FileOutputStream("input"); //opens the file in write mode
		ObjectOutputStream out = new ObjectOutputStream(fo);
		out.writeObject(s1);
		System.out.println("The write operation is done into file input");
		out.close();
		fo.close();
		
		//deserialization
		FileInputStream fi= new FileInputStream("input");
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		// LHS student type object and RHS of the type super class object	
		Student s =(Student) oi.readObject();
		System.out.println("Deserialized values:");
		System.out.println(s);
		
	}

}
