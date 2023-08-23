package com.assignment.task2;

import java.util.Scanner;

public class Program6{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        double result;

        System.out.println("enter first number");
        double num1=sc.nextDouble();


        System.out.println("enter second number");
        double num2=sc.nextDouble();
        System.out.println("choose an operator");
        char c=sc.next().charAt(0);

//        System.out.println(c);
//s=sc.nextLine().charAt(0);


        switch (c) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
                break;


        }
    }
}
