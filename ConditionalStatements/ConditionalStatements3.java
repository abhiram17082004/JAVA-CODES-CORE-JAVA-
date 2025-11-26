package com.ConditionalStatements;

import java.util.Scanner;

public class ConditionalStatements3 {



	public static void main(String[] args) {
		
		// Simple if 
		Scanner sc=new Scanner(System.in);
		int x=11;
		System.out.println("Before");
		if(x>=20)
		{
			System.out.println("Welcome");
		}
		
		System.out.println("After");
		
		//if else
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		sc.nextLine();
		
		if(age>18)
		{
			System.out.println("You're eligible to Vote");
		}
		else {
			System.out.println("You're not eligible to Vote");
		}
		
		// multiple if or if elseif
		
		int p=25,q=25;
		
		
		if(p>q)
		{
			System.out.println("p is bigger");
		}else if(p==q)
		{
			System.out.println("Both are equal");
		}else {
			System.out.println("q is bigger");
		}
		
		// Nested if
		System.out.println("Enter username");
		String uname=sc.nextLine();
		
		if(uname.equals("admin"))
		{
			System.out.println("Enter password");
			String pwd=sc.nextLine();
			  if(pwd.equals("test"))
			  {
				  System.out.println("Welcome to Vpsark");
			  }else {
				  System.out.println("Invalid password, try again");
			  }
		}else {
			System.out.println("USer name incorrect, try again");
		}
		
		
		// switch case
		
		System.out.println("Enter  day number");
		
		int day=sc.nextInt();
		
		switch(day)
		{
		case 0:System.out.println("SUNDAY");
		break;
		case 1:System.out.println("MONDAY");
		break;
		case 2:System.out.println("TuesDAY");
		break;
		case 3:System.out.println("WEDNESDAY");
		break;
		case 4:System.out.println("THURSDAY");
		break;
		case 5:System.out.println("FRIDAY");
		break;
		case 6:System.out.println("SATURDAY");
		break;
		
		default:System.out.println("Invalid day");
		
		
		}

	}

}
