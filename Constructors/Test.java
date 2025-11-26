package com.Constructors;



public class Test {

	public static void main(String[] args) {
		
		Student std1=new Student();
		std1.id=3;
		std1.name="test3";
		
		System.out.println(std1.id+" "+std1.name);

		Student std2=new Student(2,"test2");
		
		System.out.println(std2.id+" "+std2.name);
		
		
		Student std3=new Student(5);
		System.out.println(std3.id+" "+std3.name);
	}

}

