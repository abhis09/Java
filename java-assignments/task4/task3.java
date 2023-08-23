package com.assignment.task4;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {

    public static void check(int[] arr, int value)
    {
        boolean result =false;
         for(int item:arr)
         {
             if(item==value)
             {
                 result=true;
                 System.out.println("value is there");
                 break;
             }else {
                 System.out.println("it is not there");
                 break;
             }

         }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of array");
        int n=sc.nextInt();

        int i;
        int arr[]=new int[n];

        System.out.println("enter elements");
        for(i =0; i<n;i++){

            arr[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));


        System.out.println("\n enter element you want to search");
        int find = sc.nextInt();

          task3.check(arr,find);
    }
}
