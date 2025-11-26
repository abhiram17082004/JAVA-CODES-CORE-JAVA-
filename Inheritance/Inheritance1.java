package com.Inheritance;

class Veichle1{
    void printM(){
        System.out.println("veichles are travelling");
    }
}
class Car extends Veichle1{
    void printN(){
        System.out.println(" car is moving");
    }
    
}
    class Bike extends Veichle1{
        void printZ(){
            System.out.println(" bike is faster");
        }
    }
    



public class Inheritance1 {
    public static void main(String[] args) {
        Car c=new Car();
        Bike b=new Bike();
        
        c.printN();              // heirerchal inheritance
        b.printZ();
        c.printM();
        b.printM();
        
    }
}

