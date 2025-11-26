package com.Strings;

public class _StringBuilder_Buffer {

	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	
	StringBuilder sb1=new StringBuilder("hello ");     //capacity=16+length of string
	
	StringBuilder sb2=new StringBuilder(10);   // specifying capacity of string builder
	
	System.out.println(sb.capacity());        
	
	System.out.println(sb1.capacity());   // capacity for string builder and buffer is 16 
	
	System.out.println(sb2.capacity());
	 
	System.out.println(sb1.append("java"));   // adds the value at ending
	
	System.out.println(sb2.length());      // length of the builder
	
	System.out.println(sb1.insert(3,"Abhi"));  // inserts the value at that index
	
	
	
	System.out.println(sb1.toString());    // converts it into string
	
	System.out.println(sb1.charAt(2));   // returns char at particular index
	
	System.out.println(sb1.substring(2,5));    // returns substring from that range of index
	
	System.out.println(sb1.delete(2, 5));
	
	System.out.println(sb1);
	 System.out.println(sb1.replace(8, 11, "mini"));  // replaces the sequence with given string with in the given range of index
   
	 // same for string buffer also
	}
}