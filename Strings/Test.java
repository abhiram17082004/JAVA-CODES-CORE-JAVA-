package com.Strings;


public class Test {

	public static void main(String[] args) {
	
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		String s4 = new String("java");
		String s5 = new String("java");
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s4.equals(s5));//true
		System.out.println(s1 == s2);//true
		System.out.println(s4 == s5);//false
		
		
		
		System.out.println(s1.length());//5
		
		String s6 = "";
		String s7 = " ";
		
		System.out.println(s6.isEmpty());//true
		System.out.println(s7.isEmpty());//false
		System.out.println(s6.isBlank());//true
		System.out.println(s7.isBlank());//true
		
		System.out.println("String methods");
		
		System.out.println(s1.charAt(0));//h
		System.out.println(s1.toUpperCase());//HELLO
		//System.out.println(s3.toLowerCase());//hello
		
		String s8 = s3.toLowerCase();
		System.out.println(s8);// hello
		System.out.println(s3);// Hello
		
		String s9 = " Welcome java ";
		String s10 = s9.trim();
		System.out.println(s10);//welcome java
		System.out.println(s9);
		
		System.out.println(s9.contains("java"));//true
		
		String s11 = s1.concat(s9);
		System.out.println(s11);
		
		String s12 = s10.substring(3, 8);
		System.out.println(s12);
		
		String s13 = s10.replace('a', 'k');
		
		System.out.println(s13);
		

		
	}

}
