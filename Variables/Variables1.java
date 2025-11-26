package com.Variables;

public class Variables1 {
    int id;
    String name;
        static String collegeName="QIS";
    public static void main(String[] args) {
        Variables1 v1 = new Variables1();
        v1.name="abhi";
        v1.id=17;
        System.out.println(v1.name+ " "+ v1.id+" "+v1.collegeName);
        Variables1 v2= new Variables1();
        v2.name="naveen";
        v2.id=18;
        collegeName=" RISE"; // changing static variable
        System.out.println(v2.name+ " "+ v2.id+" "+v2.collegeName);
        
    }
}
    