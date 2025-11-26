package com.Abstraction;

public class Test {

	public static void main(String[] args) {
		
		//Animal a = new Animal();
		Animal a1=new Tiger("tiger");
		Animal a2=new Sheep("sheep");
		
		a1.eat();// 
		a2.eat();
		
		a1.details();
		a2.details();

	}

}

