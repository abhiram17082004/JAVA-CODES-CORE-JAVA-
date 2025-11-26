package com.ExceptionalHandling;
/*Exception Handling -- is to handle the runtime errors
 *  so that the normal flow of 
 * the application can be maintained.

--a mechanism to handle runtime error such as
 ClassNotFoundException, IOException, SQLException, RemoteException, etc.
 
 *The "try" keyword is used to specify a block where we should place
 * an exception code. The try block must be followed by either catch or finally.

 *
 *catch The "catch" block is used to handle the exception. It must be preceded by try block It can be followed by finally block later
 *
 */
public class ExceptionalHandling {
    public static void main(String[] args) {
        try{
            int d=10/0;
            System.out.println("1");
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("2");
        }
        finally{
            System.out.println("I'm executed");
        }
        System.out.println("3");
    }
}
/*stack trace contains exception name,exception message,which line,methods info*/
