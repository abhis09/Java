package com.assignment.task2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {


        System.out.println("Enter character");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            System.out.println(c+ " is an alphabet");
        else
            System.out.println(c+ " is not an alphabet");

    }
}
