package com.assignment.task3;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int number= sc.nextInt();
        int factorial =1;
        System.out.println("find factorial of "+ number + " is ");
        for(int i =1;i<=number;i++)
        {
            factorial =factorial*i;

        }
        System.out.println(factorial);
    }
}
