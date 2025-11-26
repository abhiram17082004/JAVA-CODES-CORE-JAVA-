package com.Polymorphism;



public class Test {

	public static void main(String[] args) {
		
		
		Vehicle v1=new Bike();
		v1.move();
		Vehicle v2=new Car();
		v2.move();
		Vehicle v3=new Auto();
		v3.move();
	}

}
