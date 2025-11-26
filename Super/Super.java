package com.Super;

/*The 'super' keyword allows referencing the parent 
class or superclass of a subclass in Java.
 It is often employed to access members (fields or methods) of the superclass that have been 
 overridden in the subclass. You can call the superclass's method from within the subclass using super. */
 
class Device{
    String s1="Lg";
    void display(){
        System.out.println("i am A device");
    }
    Device(){
        System.out.println(" abhi's device");
    }

}

class Tv extends Device{
    String s1="sony"; 
    Tv(){                                      // calling constructor should be first or we will get an error
        super();                              // used to invoke immediate parent class constructor.
        System.out.println(" abhi's Tv");

    }
    void display(){
        System.out.println(" Iam a tv");
        System.out.println(s1);
        System.out.println(super.s1);         // used to call immediate parent class instance variable

        super.display();             // used to  invoke immediate parent class method
    }
    
}

public class Super {
    public static void main(String[] args) {
        Tv t1=new Tv();
        t1.display();
        
    }    
}
