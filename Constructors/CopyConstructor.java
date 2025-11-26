package com.Constructors;

//Java Program for Copy Constructor

class Students {
 // data members of the class.
 String name;
 int id;

 // Parameterized Constructor
 Students(String name, int id)
 {
     this.name = name;
     this.id = id;
 }

 // Copy Constructor
 Students(Students a)
 {
     this.name = a.name;
     this.id = a.id;
 }
}
class CopyConstructor {
 public static void main(String[] args)
 {
     // This would invoke the parameterized constructor.
     System.out.println("First Object");
     
     Students s1 = new Students("Abhiram", 17);
     
     System.out.println("StudentsName :" + s1.name
                        + " and StudentsId :" + s1.id);

     System.out.println();

     // This would invoke the copy constructor.
     Students s2 = new Students(s1);
     System.out.println("Copy Constructor used Second Object");
     
     System.out.println("StudentsName :" + s2.name
                        + " and StudentsId :" + s2.id);
 }
}

