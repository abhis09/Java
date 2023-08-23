package com.assignment.task5;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
       String sr1=sc.nextLine();

        System.out.println("enter the substring");
        String sr2= sc.nextLine();

        if(sr1.contains(sr2)){
            System.out.println("yes it contains substring");

        }
       else{
            System.out.println("no it isn't contain ");
        }

    }
}
