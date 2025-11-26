package com.Polymorphism;


public class Vehicle {

	void move()
	{
		System.out.println("Vehicle is moving");
	}
	
Student	getObject()
{
	return new Student();
}
}

class Bike extends Vehicle{
	
	 void move()
	{
		System.out.println("Bike is riding");
	}
	 
	 
	Junior getObject()
	{
		return new Junior();
	}
}



class Car extends Vehicle{
	
	void move()
	{
		System.out.println("Car is racing");
	}
}


class Auto extends Vehicle{
	
	
	
}
