package com.assignment.task5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String name= sc.nextLine();
        String[] words=name.split(" ");

        StringBuilder rev=new StringBuilder();
        for(String word:words)
        {
            StringBuilder reverse= new StringBuilder(word).reverse();
            rev.append(reverse).append(" ");

        }
        System.out.println("reversestring "+ rev);




    }
}
