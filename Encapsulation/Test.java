package com.Encapsulation;



public class Test {

	public static void main(String[] args) {
		
		Student std=new Student();
		//std.id=1;
		std.setId(1);
		std.setAge(-20);
		std.setName("test1");
		
		System.out.println(std.getId()+" "+std.getName()+" "+std.getAge());
	}

}

