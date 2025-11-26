package com.Methods;

public class Methodss {
    int i=10;
    static int s=20;
    void printValue() {                     // simple or non static method
       System.out.println(" "+ i); 
       System.out.println("hello, abhi!");
    }
    public static void main(String[] args) {
        Methodss m1=new Methodss();
        System.out.println(m1.i);
        System.out.println(Methodss.s);
        m1.printValue();      // calling function 
        
    }
    
}

