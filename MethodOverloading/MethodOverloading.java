package com.MethodOverloading;

/*several methods in java are allowed to have same method name with different parameters and
 * different definitions. this concept is used when ther is necissity to perform similar task with different arguments 
 * 1) by changing number of arguments
 * 2)by changing data type 
 * 3)In Java, Method Overloading is not possible by changing the return type of the method only.
*/

public class MethodOverloading {
    static int addition(int a, int b){
        return a+b;
    }
    static int addition(int a,int b, int c){
        return a+b+c;
    }
    static double addition(double a,double b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(MethodOverloading.addition(12, 13));
        System.out.println(MethodOverloading.addition(12,13,14));
        System.out.println(MethodOverloading.addition(12.2,13.3,14));
    }

}
