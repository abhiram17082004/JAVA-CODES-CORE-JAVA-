package com.Operators;

public class Operators {
	// 8 types
	
	public static void main(String args[]) {
		int a=10;
		int b=20;
		boolean c = true;
		
		// arithmetic operators ( +,-,*,/,%)
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
		
		// unary operators(+,-,++,--,~,!)
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(~a);
		System.out.println(!c);
		
		// shift operators( <<,>>)
		
		System.out.println(a<<2); // 10*2^2=40
		// 001010 = 101000 =40
		System.out.println(a>>2); // 10/2^2=2
		//001010 = 0010 =2
		
		//Relational Operators (> , < , ==, >=,<=, !=)

		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		// Assignment Operator(=, +=,-=,*=,/=,%=)
		
		System.out.println(a+=1);
		
		//Logical Operator (&& , ||,!)
		
		System.out.println(a>b&&a<b);
		System.out.println(a>b||a<b);
		
		//Bitwise Operator(& , | ,  Xor(^))
		
		System.out.println(a^b);
		System.out.println(~a);
		
		
		// Ternary Operator (?:)    condition ? first statement : second statement
		
		System.out.println(a^b);
		
		int max=(a>=b) ?a:b;
		System.out.println(max);
		
		
	}

}

