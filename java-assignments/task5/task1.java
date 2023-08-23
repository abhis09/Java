package com.assignment.task5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.nextLine();
        char ch;
        String rev="";
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("reversed words are "+rev);
    }

}
