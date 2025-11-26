package com.InnerClass;


class OuterClass {
    int x = 10;
  
    class InterClass {
      int y = 5;
    }
  }
  
  public class InnerClass{
    public static void main(String[] args) {
      OuterClass myOuter = new OuterClass();                       // object for outer class
      OuterClass.InterClass myInner = myOuter.new InterClass();   // object for inter class
      System.out.println(myInner.y + myOuter.x);
    }
  }
  