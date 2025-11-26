package com.Encapsulation;

/*Encapsulation is a programming technique that binds data
 * and corresponding methods (behavior) together into a single
 * unit and prevents them from being accessed by other classes
 *    Encapsulation = Data hiding + Abstraction
 */

// Raping up of properties and behaviors as a single unit
// Fully encapsulated class : properties should be private and getter,setter used in retrieving data (data validation + protection)

/* pojo classes : plain old java object(A plain old Java object (POJO) is a class definition that is not tied to any 
Java framework so any Java program can use it. A POJO has no particular naming convention for properties and
 methods, or any other special restrictions. Their primary advantage is their reusability and simplicity.) */


public class Encapsulation {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setAge(int n){
        this.age=n;
    }
    public static void main(String[] args) {
        
    }

    
}

