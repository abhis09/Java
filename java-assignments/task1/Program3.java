package com.assignment.task1;

public class Program3 {



    public static void main(String[] args) {

        int a,b,temp;
        a = 5;
        b = 6;
        temp=a;
        a=b;
        b=temp;

        System.out.println( a );
        System.out.println( b );


        // same task without using third variable
        System.out.println("swap two numbers without using third variable");
        int c=25;
        int d=26;
        c=c+d;
        d=c-d;
        c=c-d;

        System.out.println(c);
        System.out.println(d);
    }
}
