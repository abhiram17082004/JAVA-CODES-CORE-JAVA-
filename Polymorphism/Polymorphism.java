package com.Polymorphism;

/*polymorphism = many forms (task that can perform a single action in different ways)
  1) static binding/compile time polymorphism/Early binding: behavior of a method decided at compile time . 
  ****** It will happen in same class
   Ex: method overloading,constructor overloading,method hiding
  *********it will happen in different class
  2) dynamic bindig /runtime polymorphism/late binding: behavior of a method decided at runtime  Ex: method overriding
  rules:
  1) method signature must be same(name+ parameters)
  2) return type also must be same for primitive data type and void.
  3) return type can change in non primitive for class and interface in inheritance
   for example we can give child class as return type for behavior instead of parent class because of inherited properties (covariance) added in java 1.2
  4) access modifier is based on restriction.
  
  // Java Program for Method overloading
// By using Different Types of Arguments

class Helper {

	// Method with 2 integer parameters
	static int Multiply(int a, int b)
	{
		// Returns product of integer numbers
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(double a, double b)
	{
		// Returns product of double numbers
		return a * b;
	}
}

/
class GFG {
	// Main driver method
	public static void main(String[] args)
	{
		// Calling method by passing
		// input as in arguments
		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
	}
}

 * 2)dynamic/runtime polymorphism/late binding: behaviour of a method decided at run time    Ex: method overriding
    // Java Program for Method Overriding

// Class 1
// Helper class
class Parent {

	// Method of parent class
	void Print()
	{

		// Print statement
		System.out.println("parent class");
	}
}

// Class 2
// Helper class
class subclass1 extends Parent {

	// Method
	void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class subclass2 extends Parent {

	// Method
	void Print()
	{

		// Print statement
		System.out.println("subclass2");
	}
}

// Class 4
// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class 1
		Parent a;

		// Now we will be calling print methods
		// inside main() method

		a = new subclass1();
		a.Print();

		a = new subclass2();
		a.Print();
	}
}

 */
class Animals{
    static void run1(){
        System.out.println("h.. Animal is running");
    }
     void run2(){
        System.out.println("o.. Animal is running");
    }
}

class Cheetah extends Animals{
    static void run1(){                                    // method hiding
        System.out.println("h.. Cheetah runs faster");
    }
     void run2(){                                         // method overriding
        System.out.println("o.. Cheetah runs faster");
    }
}                                            

public class Polymorphism {
    public static void main(String[] args) {
        Animals a=new Cheetah();
		// a.run1 from animal
		//a.run2 from cheetah
        a.run1();  //hiding    static
        a.run2();  // overriding   dynamic
    }   
}

