package com.blocks;

public class Student {
	
	int id;
	String name;
	static String collegeName;
	
	Student()
	{
	}
	
	
	Student(int id,String name)
	{

		this.id=id;
		this.name=name;
	} 
	
	
	static                  //static blocks are executed before main method
	{
		collegeName="VIT";
	System.out.println("static block1");
	}
	
	
	static
	{
	System.out.println("static block2");
	}
	

	
	{
		System.out.println("object is being created");
		                                                //non static blocks are executed after main method
		System.out.println("Non static block1");        // non static blocks executes as no  of times objects created
	}
	
	{
		System.out.println("Non static block2");
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("inside main method");
	Student std=new Student();
	
	Student std2=new Student();
	
	
	Student std1=new Student(17,"Abhiram");
	Student std3=new Student(1,"Pavan");
	
	}

}
