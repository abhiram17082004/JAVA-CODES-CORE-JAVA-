package com.Strings;

public class Strings1 {

	public static void main(String[] args) {
		String s="Skyalab";
		
		String s1=new String("HELLO");
		String s2=new String("hello");
		
		
			// STRINGS ARE STORED IN HEAP
		    //  DUPLICATED VALUES STORED IN STRING CONSTANT POOL AND AS ONE,IF IT IS LITERAL
			//  DUPLICATED VALUES STORED IN HEAP AND STRING CONSTANT POOL
		
		
		System.out.println(s);						// returns value of s
		
		System.out.println(s1);						// returns value of s1
		
		System.out.println(s.charAt(2));          // returns value at index 2
		
		System.out.println(s.lastIndexOf('a'));   // returns last index of 'a'
		
		System.out.println(s.contains("ky"));     //checks if it exists
		
		System.out.println(s.length());           // returns length
		
		System.out.println(s.replace('a', 'b'));  // replaces char 'a' with 'b'
		
		System.out.println(s.endsWith(s));          // checks if string ends with particular character
		
		System.out.println(s.toLowerCase());		//  returns in small letters
		
		System.out.println(s.toUpperCase());		//  returns in capital letters
		
		System.out.println(s.concat(s1));			// concatenates two strings
		
		System.out.println(s.substring(3));        // return substring for given index
		
		System.out.println(s.equals(s1));          // checks if both strings are equal
		
		System.out.println(s1.equalsIgnoreCase(s2));  // checks if both strings are equal irrespective of Case
		
		System.out.println(s1.isEmpty());            // checks if string is empty
		
		System.out.println(s1.trim());               // removes white space from begining and ending of string 
		
	}

}
