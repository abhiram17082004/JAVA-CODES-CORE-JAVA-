package com.Final;

/*final is a keyword.
 * cannot extend final class
 * cannot override final method
 * cannot assign value to final variable
 */
class F{
    void fun(){
        System.out.println("HI!");
    }
}
public  final class Final extends F {       // final class
    final int a=10;                        // final variable
     final void fun(){                    // Final method
        System.out.println("hello!");
    }
    public static void main(String[] args) {
        Final f=new Final();
        
        System.out.println(f.a);
          f.fun();


    }
}
