package com.ExceptionalHandling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

      System.out.println("code before");
      
      //NullPointerException
      String s1="Hello";
      
      
      //s1=null;
      
     System.out.println(s1.length());
     
     Student std=new Student();
     
    // System.out.println(std.name.toUpperCase());
     
     System.out.println("Code after Null Pointer EXception");
     
     
     
     //ArithmeticException
     Scanner sc=new Scanner(System.in); 
     System.out.println("ENyer two numbers");
     int a=sc.nextInt();
     int b=sc.nextInt();
     
     System.out.println(a/b);
    
     
     System.out.println("Code after ArithmeticException");
     
     
     //NumberFormatException
     
     sc.nextLine();
     
     System.out.println("Enter a string");
     String s= sc.nextLine();
     
     int i=Integer.parseInt(s);
     
     System.out.println(i);
     
     System.out.println("Code after NumberFormatException");
     
     
     //ClassCastException
     
     //ImplicitCasting
     Vehicle v1=new Bike();
     Vehicle v2=new Car();
     
     
     //Explicitconvert
     
     
     Bike b1= (Bike) v1;
     
     Car c2 =  (Car)v2;
     
     
     
     //Car c1=  (Car)v1;
     
     
     System.out.println("code after Class cast exception");
     
     
//IndexOutOfBoundsException
     
     
     int[] arr= {10,20,30};
     
    // System.out.println(arr[5]);
     
     
     String  s2= "java";
     
     
    
     
     System.out.println(s2.charAt(4));
     
     
	}

}
