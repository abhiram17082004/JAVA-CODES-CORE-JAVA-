package com.Constructors;

/*
 * Java constructors or constructors in Java is a terminology used to construct something in our programs.
 *  A constructor in Java is a special method that is used to initialize objects. 
 * The constructor is called when an object of a class is created. 
 * It can be used to set initial values for object attributes
 */
  /*  this keyword is used to refer instance class variable,invoke a
  current class method, current class constructor,can be passed as an argument in method call,constructor call,
  to return current class instance from the method*/
import java.io.*;
 public class Constructor {
    int a;
    String b;
           Constructor(int a,String b){ // parametarized constructor
        this.a=a;
        this.b=b;           // calling class instance variables
        this.display();    // calling a method
           }
       Constructor(){
        System.out.println(" hi");
       }    
       Constructor(int x){
        this();                   // calling a constructor
        System.out.println(x);    
       }
     void display(){
        System.out.println(" i am abhiram");
     }
     void m(Constructor obj){
        System.out.println("invoked");
     }
     void s(){
        m(this);         // passed  as an argument in method 
     }
public static void main(String[] args) {
    Constructor c=new Constructor(1,"abhi");  // argumented constructor
    Constructor c1=new Constructor(10);
    Constructor c2=new Constructor();
        System.out.println(c.a + " "+ c.b);
        c2.s();


   }
}
