package com.Casting;

public class Casting {

	public static void main(String[] args) {
		int a=10;
		float b= 10.25F;
		float c= a; // automatic or implicit or widening
		int d= (int)b; // manual or explicit or narrow
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		String s1="100";
		int i =Integer.parseInt(s1); // raper class
		float f1=Float.parseFloat(s1);
		System.out.println(i); 
		System.out.println(f1);
		char c1='c';                                          
		int i1=c1;                // char to integer
		System.out.println(i1);
	}

}
