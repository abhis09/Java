package com.assignment.task6;

public class Rectangle {

    double length, breadth;

    public double area() {
        return length * breadth;

    }

    public Rectangle() {
    }

    public Rectangle(double length) {
        this.length = length;
        this.breadth=length;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static void main(String[] args) {
        Rectangle obj1=new Rectangle();
        Rectangle obj2=new Rectangle(12);
        Rectangle obj3=new Rectangle(12,16);


        System.out.println("area of rectangle"+obj1.area());
        System.out.println("area of rectangle"+obj2.area());

        System.out.println("area of rectangle"+obj3.area());

    }
}
