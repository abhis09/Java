package com.assignment.task3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        int first=0;
        int second=1;


        System.out.println("fibonacci series"+ number + "is");

        for(int i=1;i<=number;i++){
            System.out.println(first+" ");
            int next = first + second;
            first  = second;
            second = next;
        }
    }
}
