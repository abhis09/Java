package com.assignment.task2;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("number is positve");

        } else if (x < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }
    }

}
