package com.assignment.task6;

public class Student {


    String name;
    int EnrollmentNo;

    public Student(String name, int enrollmentNo) {
        this.name = name;
        EnrollmentNo = enrollmentNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", EnrollmentNo=" + EnrollmentNo +
                '}';
    }

    public static void main(String[] args) {

        Student obj1=new Student("Amay",132);
        System.out.println(obj1);
    }
}
