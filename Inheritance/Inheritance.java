package com.Inheritance;

//single,multilevel ,hierarchical,(multiple,hybrid) not supported in java


class Animal {     // base class or parent class
  void printA(){
      System.out.println(" animal is running");
  }
}
  class Dog extends Animal{
      void printD(){
          System.out.println(" dog is barking");
      }

  }
      class Cat extends Dog{
          void printL(){
              System.out.println(" cat is meowing");
          }
      }
   public class Inheritance{

  public static void main(String[] args) {
      Cat c=new Cat();
      c.printD();           // multilevel inheritance
      c.printA();
      c.printL();

      
  }

  }
// this is currently invoked object
   // super is parent class object
   
   // is a relationship is another name of inheritance