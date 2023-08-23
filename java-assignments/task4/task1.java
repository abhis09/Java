package com.assignment.task4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);


        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        System.out.println(" the array "+ "is");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
