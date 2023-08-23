package com.assignment.task4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter size of elements");
        int n= sc.nextInt();
        int[] arr= new int[n];
        int sum=0;
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<n;i++){
            sum+=arr[i];

        }
        double avg= sum/n;
        System.out.println("the average is"+avg);

    }
}
