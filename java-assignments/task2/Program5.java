package com.assignment.task2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int per;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the percentage");
        int number=sc.nextInt();


        if(number>90)
        {
            System.out.println("grade A");
        } else if (number>75) {
            System.out.println("grade B");

        }else if(number>65)

        {
            System.out.println("grade C");
        }



          }

    }
