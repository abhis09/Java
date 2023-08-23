package com.assignment.task3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int num= sc.nextInt();
        int temp,sum=0,r;

        temp=num;

        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }

        if(temp==sum){
            System.out.println("palindrom number");}
            else{
            System.out.println("not palindrom");
            }
        }
    }

