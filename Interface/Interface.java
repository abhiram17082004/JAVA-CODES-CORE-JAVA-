package com.Interface;

/*                                             
 * An interface is a collection of abstract methods and constants (i.e. static and final fields). 
  It is used to achieve complete abstraction.
Every interface in java is abstract by default. 
So, it is not compulsory to write abstract keyword with an interface.
 Interface fields are public, static and final by default and also for properties, and the methods are public and abstract.
*/

// to achieve 100 % abstraction and supports multiple inheritance.

interface Printaable{
     int A=20;
    void prints();
}

interface Showaable{                // constants (final) values variables name should be in capital letter
    void show();
}
                                     // implements create  only non duplicated methods body
                                    // extends create  all the methods body



public class Interface implements Printaable,Showaable {
    public void prints(){
        System.out.println("print");
    }
    public void show(){
        System.out.println("show");
    }
    
    public static void main(String[] args) {
        Interface i=new Interface();
        i.prints();
        i.show();
        System.out.println(i.A);
    }
    
}
