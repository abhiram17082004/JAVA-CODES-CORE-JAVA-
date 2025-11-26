package com.Modifiers;

/* access        within     within     outside package by     outside       
modifier      class     package     subclass only         package
 
  private       y            n           n                      n

  default       y            y           n                      n

  protected     y            y           y                      n
  
  public        y            y           y                      y  
*/


public class Modifiers {
 private int d=10;
 private void printing(String s){
         System.out.println(s);
 }

 public static void main(String[] args) {
     Modifiers m=new Modifiers();
     m.printing("sun");
     System.out.println(m.d);
 }
}
