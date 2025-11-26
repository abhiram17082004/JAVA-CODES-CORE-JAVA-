package com.ExceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
	
	
	void readFile(File f) throws FileNotFoundException {
		
		FileReader fr=new FileReader(f);
		
	}
	
	
	void read(File f)
	{
		try {
			this.readFile(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	void testread(File f) throws FileNotFoundException
	{
		this.readFile(f);
	}

	public static void main(String[] args) {
		
		
		Test1 t1=new Test1();
		
		File f=new File("C:\\Users\\alex\\Desktop\\Variable_Notes.txt");
		t1.read(f);
		
		
		
		try {
			t1.testread(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
