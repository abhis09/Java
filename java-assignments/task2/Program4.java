package com.assignment.task2;

import java.util.Scanner;

public class Program4
{
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap;
        if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        }
            else{
                leap = false;
            }

            if (leap) {
                System.out.println("this " + year + " is  leap year");
            } else {
                System.out.println("this year is not leap year");
            }
        }
    }
