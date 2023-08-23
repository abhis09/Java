package com.assignment.task4;



import java.util.Arrays;
import java.util.Scanner;

public class task5 {

    public static void pair(int[] arr, int target)
    {
        for(int i=0;i<arr.length - 1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("pair found with the sum of " + arr[i] + " " + arr[j]);

                }
            }
        }

        }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");


        for(int i=0;i<n;i++) {
            // System.out.println(arr);

            arr[i] = sc.nextInt();
        }
        int target=6;
        pair(arr,target);




        }


    }
