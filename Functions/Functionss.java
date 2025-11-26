package com.Functions;

import java.util.Scanner;

public class Functionss {
    static  int printAdd(int x, int y){
        System.out.println( x+y+" ");
        return x+y;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a= sc.nextInt();
         int b= sc.nextInt();
        printAdd(a,b);
       
    }
    
}
