/*Java throw keyword is used throw an 
exception explicitly in the code, 
inside the function or the block of code.

Used for runtime exceptions
*/
package com.ExceptionalHandling;

public class Throw {
    
    static void check(int a){
        if(a<18){
            throw new ArithmeticException("not ligible");
        
        }
        else{
            System.out.println("eligible");
        }
    
     }
  
       public static void main(String[] args) {
          check(12);
       }
} 

   // output= type of error,description and stack  trace