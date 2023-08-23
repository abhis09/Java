package com.assignment.task6;





public class Student2 {

    String name;
//constructor overloading
    public Student2() {
        this.name="Unknown";
    }

    public Student2(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student2 obj1=new Student2();

        Student2 obj2 =new Student2("Abhi");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
