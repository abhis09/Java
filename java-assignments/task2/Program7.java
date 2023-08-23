package com.assignment.task2;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        int n=sc.nextInt();
//for(int i=0;i<n;i++) {
//    if (i < 0) {
//        System.out.println("itss over");
//        break;
//
//    }
//
//
//    if (i > 0) {
//        System.out.println("good going");
//
//    }
//}

         while(true) {
             System.out.println("enter the number");
             int n=sc.nextInt();
             if (n < 0) {
                 break;
             } else {
                 System.out.println("good going");

             }


         }



    }
}
