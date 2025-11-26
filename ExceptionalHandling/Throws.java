/*

Java throws keyword is used in the method 
signature to declare an exception which might be
thrown by the function while the execution of the code.

Used for mainly compile time exceptions
 * */
package com.ExceptionalHandling;

public class Throws {
	int div(int a,int b) throws ArithmeticException{
		int d=a/b;
		return d;
	}

	public static void main(String[] args) {
		Throws t = new Throws();
		
		try {
		
		System.out.println(t.div(10, 0));
		}
		catch(ArithmeticException e) {
			System.out.println("exception");
		}

	}

}

/* object,throwable,exception(indexout of bound,null pointe exception,arithmetic exception),io exception(file not found exception),sql exception*/