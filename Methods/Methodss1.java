package com.Methods;

public class Methodss1{
    static int multiple (int a){
        System.out.println(5*a);
        return 5*a;
    }                                                   // code reusability
                                                        // and easier
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            multiple(i);
        }
    }
}

