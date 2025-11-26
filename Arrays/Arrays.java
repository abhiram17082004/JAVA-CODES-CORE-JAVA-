package com.Arrays;

import java.util.Scanner;

// single dimension array

public class Arrays {
    public static void main(String[] args) {
        int a[]= new int[10];
        // int a[] ={1,2,3,4,5}
        
       
        
        
       Scanner sc= new Scanner(System.in);
       System.out.println("  enter size of array less than 11");
       int n=sc.nextInt();
       System.out.println("enter elements: ");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        	
        }
        	for(int i=0;i<n;i++) {
        		System.out.println(a[i]);
        }

    }
 }

// i/p  