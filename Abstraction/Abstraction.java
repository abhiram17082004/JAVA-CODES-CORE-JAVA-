/* It is a process of hiding complex implementation details 
from the user providing ,only necessary functionality to user .
1) created with abstract keyword

2)cannot create an object for abstract class

3) it can have zero or more abstract methods which are not allowed in non-abstract class

4)abstract method do not have implementation and method body,do not contain method body

5)the child class which inherits abstract class must provide the implementation of these
inherited abstract methods*/

package com.Abstraction;

abstract class Parts{
        String n;
    Parts(String n){                          // abstract classes can also have constructors
    	
        this.n=n;                             // abstract classes cannot be instantiated
    }
    abstract void func();
    void f(){                                   // normal methods or concrete methods
        System.out.println(n);
                                                // child class must call or invoke parent class constructors
    }
    
}
class Brakes extends Parts{                  
    String n;
    Brakes(String n){
        super(n);
    }
    void func(){
        System.out.println(" car should be halted");
    }
}
class Accelerator extends Parts{
    Accelerator(String n){
        super(n);
    }
    void func(){
        System.out.println("car should be accelerating");
        
    }
}

class Gear extends Parts{
    int ge;
    Gear(String n,int ge){
        super(n);
        this.ge=ge;
    }
    void func(){
        System.out.println("car gear should be changed: "+ge);
        
    }

}


public class Abstraction {
    public static void main(String[] args) {
        Brakes b=new Brakes("Brakes");
        b.func();
        b.f();
        Accelerator a=new Accelerator("Accelerator");
        a.func();
        a.f();
        Gear g=new Gear("Gear",5);
        g.func();
        g.f();
    }
    
}




