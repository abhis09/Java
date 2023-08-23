package com.assignment.task2;

import java.util.Scanner;


//program for input electricity charge
public class Program9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter units");
        int units=sc.nextInt();
        double totalbill;
        if(units<=60)
            totalbill=units*0.30;
        else if(units>60 && units<=150)
            totalbill = 18+(units-60)*0.75;
        else if(units>150 && units<=270){
            totalbill=18+67.5+(units-150)*1.10;
        }
        else
        {
            totalbill=18+67.5+132+((units-270)*2.50);
        }

    //surcharge of 20%;
        totalbill +=totalbill*0.20;
        System.out.println("final bill"+ totalbill);
    }
}