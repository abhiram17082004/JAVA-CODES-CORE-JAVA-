package com.MethodOverriding;

/* both parent and child class methods should be non-static
In Java, Overriding is a feature that allows a subclass or child class to provide
a specific implementation of a method that is already provided by 
one of its super-classes or parent classes. When a method in a subclass has the same name, 
the same parameters or signature, and the same return type(or sub-type) as
a method in its super-class, then the method in the subclass is said to override the method in the super-class.


* 
*/

//Class 1

class Parent {

	// Method of parent class
	void Print()
	{

		// Print statement
		System.out.println("parent class");
	}
	
}

//Class 2
class subclass1 extends Parent {

	// Method
	void Print() { System.out.println("subclass1"); }

}

//Class 3
class subclass2 extends Parent {

	// Method
	void Print()
	{

		// Print statement
		System.out.println("subclass2");
	}
}

//Class 4
//Main class
class MethodOverriding {

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

