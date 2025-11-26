package com.Inheritance;


public class Junior extends Student {
	
	int age;
	int x=10;
	
	public Junior(int id, String name,int age) {
		super(id, name);
		this.age=age;	
		
	}
	void print()
	{
		System.out.println("inside Child class");
	}
	
	void display()
	{
		int x=30;
		System.out.println(super.x);
		super.print();
	}
	

}
