package com.Constructors;

public class Constructor1 {
	int a;
	int b;
	Constructor1(int a){
		this(2,5);     // constructor chaining
		this.a=a;
		this.b=b;
		System.out.println("from 1st constructor");
		
	}
	Constructor1(int a,int b){
		this();
		this.a=a;
		this.b=b;
		System.out.println("from 2nd constructor");
		
	}
	Constructor1(){
		
		this.a=a;
		this.b=b;
		System.out.println("from 3rd constructor");
		
	}
	
	public static void main(String[] args) {
		Constructor1 c1=new Constructor1(15);
		Constructor1 c2=new Constructor1(10,20);
	    Constructor1 c3=new Constructor1();
	    c3.a=37;
	    c3.b=45;
	    
	    System.out.println(c1.a+" "+c1.b);
	    System.out.println(c2.a+" "+c2.b);
	    System.out.println(c3.a+" "+c3.b);
	}

}
