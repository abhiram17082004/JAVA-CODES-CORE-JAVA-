package com.Methods;

//call by reference : instead of  copying the values of variables,the adress of varible is used
// change in the variable also affects value of the variable outside the function


public class Ref {
int a; 
int b;
private static void add(Ref op, Ref op1){
op.a=10;
System.out.println("result from method: "+(op.a+op.b));
}
public static void main(String[] args) {
Ref op =new Ref();
Ref op1=new Ref();
op.a=2;op.b=3;
System.out.println("result before passing: "+(op.a+op.b));   
add(op,op);  // call method
System.out.println("result after passing: "+(op.a+op.b));

}

}