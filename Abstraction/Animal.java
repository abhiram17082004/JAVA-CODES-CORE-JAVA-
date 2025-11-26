package com.Abstraction;

abstract public class Animal {
	
	String name;
	
	Animal(String name)
	{
		this.name=name;
	}
	
abstract void eat();

void details()
{
	System.out.println("I am a "+this.name);
}

}

class Tiger extends Animal{

	Tiger(String name) {
		super(name);
		
	}

	@Override
	void eat() {
		System.out.println("It is carnivores and will eat flesh");
		
	}
	
}




class Sheep extends Animal{

	Sheep(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		System.out.println("it is herbivores and eats grass");
		
	}
	
	
	
	
}