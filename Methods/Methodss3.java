package com.Methods;

//call by value: means the argument's value is copied and is passed to the parameter list of methods
// change made in a copy of variable never modify the value of variable outside the function 

public class Methodss3 {
int a;                     // declare
int b;
private static void add(int s,int t){    // parameters
s=10;    // initialize
System.out.println("result from method: "+(s+t));
}
public static void main(String[] args) {
Methodss3 m = new Methodss3();                                  // call by value
m.a=1;
m.b=2;
System.out.println("result before passing: "+(m.a+m.b));
add(m.a, m.b);    // arguments
System.out.println("result after passing: "+(m.a+m.b));
}
}

