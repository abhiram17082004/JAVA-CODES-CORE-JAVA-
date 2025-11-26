package com.Inheritance;

public class Test {

	public static void main(String[] args) {
		
		
	A a1=new A();
	A a2=new B();
	A a3=new C();
	
	
	
	
	Student std=new Junior(1,"test1",22);
	std.print();
	((Junior)std).display();
	
	}

}
