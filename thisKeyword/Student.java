package com.thisKeyword;

public class Student {
	
	int id;
	String name;
	
	
	Student(int id,String name)
	{
		this();             // current class constructor chaining
		this.id=id;
		this.name=name;     // invoking current class properties
	}
	
	
	Student()
	{
		System.out.println(" I am alone ");
		
	}
	
	
	void wish()
	{
		System.out.println("hello");
		this.wish2();
	}
	
	void wish2()
	{
		System.out.println("welcome  "+this.name);
	printDetails(this);                             // passed as an argument in method
	}
	
	void printDetails(Student std)          // object as an parameter
	{
		System.out.println(std.id+" "+std.name);
	}
	
	Student getObject()    // class return type
	{
		return this;                     // returns current class object
	}

	public static void main(String[] args) {
		
	Student std1=new Student();
	Student std2=new Student(17,"Abhi");
	
	std2.wish();
	
	Student std3=std2.getObject();
	System.out.println(std3.id+" "+std3.name);
		
	}

}

