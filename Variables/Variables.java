package com.Variables;

public class Variables {

	static int x=10;//global variables, global scope
	                        // 10 is literal and x is variable
	
	
	public static void main(String[] args) {
	//local variables, local scope
		int y=20;//it must be created and initialized before it's use
	System.out.println(x);
	
	System.out.println(y);
	

	}
	
	
	public void display()
	{
		
	System.out.println(x);
	System.out.println(x);
		
	}
	
	
	
	}
	
	


