package com.assignment.task3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
   int sum = 0;
        int num=1;
        for(int i=1;i<=n;)
        {
            if (num%2==0)
            {
                sum+=num;
                i++;

            }
            num++;
        }

        System.out.println("sum "+sum);
    }
}
