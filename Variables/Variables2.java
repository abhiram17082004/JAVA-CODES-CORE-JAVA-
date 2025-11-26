package com.Variables;

/*Create a class called Test and inside it create global variables and local variables and initialize them with any values you wish , print all in main method.

i.  x, y(int , non static)
ii. a, b (int, static)
iii. z, x (local ) */


public  class Variables2 {
int x;
int y;
static int a =10;
static int b=20;


public static void main(String[] args) {
int z=30;
int x=15;
Variables2 t1=new Variables2();
t1.x=25;
t1.y=35;
System.out.println(x);
System.out.println(Variables2.a);
System.out.println(Variables2.b);
System.out.println(t1.x);
System.out.println(t1.y);

}
}
