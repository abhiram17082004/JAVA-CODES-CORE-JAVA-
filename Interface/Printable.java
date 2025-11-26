package com.Interface;



public interface Printable {
	
	void print();

}

interface Showable{
	void print();
	void show();
}


class Printer implements Printable,Showable{

	@Override
	public void print() {
		System.out.println("I am a printer class");
		
	}

	@Override
	public void show() {
		System.out.println("I am implementing Showable interface");
		
	}
	
}
