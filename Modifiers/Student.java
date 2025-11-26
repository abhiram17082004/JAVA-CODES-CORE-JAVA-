package com.Modifiers;


public class Student {
	
	protected int id;
	protected String name;
	
	
	protected Student()
	{
		
	}
	
	protected void wish()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		Student std=new Student();
		std.id=1;
		std.name="test1";
		
		std.wish();
	}

}




