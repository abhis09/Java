package com.assignment.task6;

public class Employee {

    String name, year_of_join, address;

    public String getName() {
        return name;
    }

    public String getYear_of_join() {
        return year_of_join;
    }

    @Override
    public String toString() {
        return
                "name='" + this.getName() + '\'' +
                ", year_of_join='" + year_of_join + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public Employee(String name, String year_of_join, String address) {
        this.name = name;
        this.year_of_join = year_of_join;
        this.address = address;

    }


    public static void main(String[] args) {

        Employee emp1 = new Employee("Robert","1994","64C-Walls Street");
        Employee emp2 = new Employee("Sam","2000","68D-Walls Street");
        Employee emp3 = new Employee("John","1999","26B-Walls Street");


        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
