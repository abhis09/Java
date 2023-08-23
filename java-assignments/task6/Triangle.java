package com.assignment.task6;

public class Triangle {

    private int a,b,c;
int g;
     public double perimeter(){
          g=a+b+c;
         return g;
     }

     public double area(){
        double s= (a+b+c)/2;
         //System.out.println(s);

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

     }
    public static void main(String[] args) {
        Triangle one=new Triangle();
        one.a=3;
        one.b=4;
        one.c=5;

        System.out.println(one.perimeter());
        System.out.println(one.area());
     }
}
