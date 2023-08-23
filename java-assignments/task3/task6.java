package com.assignment.task3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first;
        int second;
        int sum;
        char answer;
        do{
            System.out.println("enter first number");
            first = sc.nextInt();
            System.out.println("enter second number");
            second=sc.nextInt();
            sum= first + second;

            System.out.println(sum);
            System.out.println(" do you want to continue again? yes or no");

            answer= sc.next().charAt(0);

        }
        while (answer == 'y' || answer =='Y');
    }
}
