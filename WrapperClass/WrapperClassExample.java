package com.WrapperClass;


public class WrapperClassExample {

	public static void main(String[] args) {
		
		//primitive to wrapper
		int i=10;
		Integer in=Integer.valueOf(i);
		
		Integer in1= i;//Auto boxing
		Integer in2= 15;
		System.out.println(in);
		System.out.println(in1);
		System.out.println(in2);
		
		Long ln=15l;
		
		
		
		//wrapper to primtive
		
		Float fn=10.25f;
		Float f1= fn.floatValue();
		float f2= fn;// auto unboxing
		
		System.out.println(f1);
		System.out.println(f2);
		
		//String conversions
		
		String s="100";
		
		int i3=Integer.parseInt(s);
		
		System.out.println(i3);
		
		
		

	}

}

