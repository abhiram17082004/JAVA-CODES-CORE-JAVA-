package com.Interface;


public class Test {
	
		static void display(Printablee p) {
			p.prints();
		}

	public static void main(String[] args) {

		//Printable p=new Printable();//can'be instantiated
		Printable p=new Printer();
		Showable s=new Printer();
		
		Printablee p1=()->{
			System.out.println("Hello");
		};
		Printablee p2=()->{
			System.out.println("Hi");
		};
		Printablee p3=()->{
			System.out.println("Abhi");
		};
		
		display(p1);
		display(p2);
		display(p3);
		
		display(()->{System.out.println("java programming");});
	}

}


