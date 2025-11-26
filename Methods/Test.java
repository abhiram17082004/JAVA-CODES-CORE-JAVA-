package com.Methods;



public class Test {
	
	
	int add(int x,int y)
	{
		int z=x+y;
		return z;
	}
	
	
	void mul(int x,int y)
	{
		System.out.println(x*y);
	}

	
	static void sub(int x,int y)
	{
		System.out.println(x-y); 
	}
	
	
	void printName(Student std)
	{
		System.out.println(std.name);
	}
	
	
	
	Student getObject()
	{
		Student std=new Student();
				std.id=1;
		std.name="test2";
		return std;
	}
	public static void main(String[] args) {
	
		Test t=new Test();
		int z=t.add(5,6);
		
		System.out.println(z);
		
		t.mul(10,20);
		
		Test.sub(20,10);
		sub(25,15);
		
		
		Student std=new Student();
		std.name="test1";
		t.printName(std);
		
		
		std.wish();
		
		Student.display();
		
		
		Student std1=t.getObject();
		
		System.out.println(std1.id+" "+std1.name);

	}
	
	

}

