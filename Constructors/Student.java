package com.Constructors;

public class Student {
	
	int id;
	String name;
	
	Student()
	{
	    this(1);//constructor chaining,must be the first statement
		this.name="test1";
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	Student(int id)
	{
		this(id,"test3");
		this.id=id;
		
	}
	
	
	Student(String x)
	{
		
	}

}

