package com.assignment.task2;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        double tax;
        double incometax=0;
        System.out.println("enter your amount");
        double income=sc.nextDouble();
         if((income>=250000) && (income<=600000))
         {
             tax=0.1;
             incometax=income*tax;
             
         } else if ((income>600000) && (income<=12000000)) {
             tax=0.18;
             incometax=income*tax;
             
         }
         else if((income>12000000)){
             tax=0.25;
             incometax=income*tax;
        }
        System.out.println("the final amount "+ incometax);
    }
}
