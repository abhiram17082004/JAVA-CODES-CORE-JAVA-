package com.Methods;

import java.util.Scanner;

public class Methodss2 {
    int a;
    int b;
    void min(int a,int b){       // parameters(formal): 
        if(a>b)
            System.out.println(+a+" is min ");
        
        else 
            System.out.println(+b+" is min");
         

    }
    public static void main(String[] args) {
        Methodss2 m =  new Methodss2();
        Scanner sc = new Scanner(System.in);   // create object for non static
        int c=sc.nextInt();                    // call directly for static or use classname
        int d=sc.nextInt();
        m.min(c,d);   // arguments: values passed (actual parameters)
    }
}

