package com.Final;



public class Test1 {
	final int y;
	final static int z;
	Test1(int y)
	{
		this.y=y;
	}
	
	static {
		z=25;
	}

	public static void main(String[] args) {
		
		final int x=10;
		//x=25;
		
		Test1 t=new Test1(10);
		System.out.println(t.y);
		// t.y=15;

	}

}

