package com.Polymorphism;


public class Sample {
	
	
	void add(int x, int y)
	{
		System.out.println(x+y);
	}
	
	int add(int p,int q,int r)
	{
	return p+q+r;	
	}
	
	String add(String s1,String s2)
	{
		
	return s1+s2;	
	}
	

	public static void main(String[] args) {
		
Sample s=new Sample();

s.add(10,20);
s.add(10,15,20);
s.add("hello", "java");
	}

}

