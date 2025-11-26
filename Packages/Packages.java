package com.Packages;

/*package:to store classees
1) inbuilt  2)
imports: used to import classes from other packages ex: import com.two.Employee; // for importing one class
					(explicit)		import com.two.*; 	// for importing whole classs

fully qualified name: packagename and class name. (implicit)*/ 

import java.util.Scanner;


public class Packages {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
    

