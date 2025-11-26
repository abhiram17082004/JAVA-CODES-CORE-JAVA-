package com.ExceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsExample {

	public static void main(String[] args)  {
	
		
		
		File  f = new File("C:\\Users\\alex\\Desktop\\Variable_Notes1.txt");
		
		try {
			FileReader fr=new FileReader(f);  // exceptional code
			
			Class.forName("Oracle.jdbc.driver.ojdbc");//
			
			
			String s=null;
			s.charAt(2);
			//SQL-----
			System.out.println("code after exception in side try block");
			
		} catch (FileNotFoundException e) {
			System.out.println("catch block");
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println("catch block");
			System.out.println(e);
		}catch(Exception e)
		{
			
		}
		finally {
			System.out.println("finally block");
		}
		
		//
		
		
	System.out.println("code after exception handling");
	
	
	try {
		FileReader fr=new FileReader(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
		

	}

}
