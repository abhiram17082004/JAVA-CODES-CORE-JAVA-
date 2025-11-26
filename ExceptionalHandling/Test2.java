package com.ExceptionalHandling;

import java.util.Scanner;

public class Test2 {
	
	
	public void getAge(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Age must be greater than 18");
		}
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age");
		
		int age=sc.nextInt();
		
		Test2 t=new Test2();
		
		try {
			t.getAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
