package com.assignment.task5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
  char target = sc.nextLine().charAt(0);
        int count=0;

        for(int i=0;i<str.length();i++)
        {

            if(str.charAt(i) == target)
            {
                count++;
            }
        }
        System.out.println("Ocurrence of b is: " +count+" Times");
    }
}