package com.assignment.task3;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number =  sc.nextInt();
        int i=2;
        boolean sign=false;
     while(i<=number/2) {
         if (number % i == 0) {
             sign = true;
             break;

         }
         ++i;

     }
    if(!sign){
        System.out.println(number+" is a prime number ");

    }

    else{
        System.out.println(number +" is not a prime number");
    }

}}
