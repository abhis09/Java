package com.assignment.task2;

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your basic salary");


        double basic = sc.nextDouble();
        double gross = 0;
        double hra=0;
        double da=0;

        if (basic <= 15000) {

            hra = basic * 0.25;
            da = basic * 82;

            //System.out.println();
        } else if (basic <= 20200) {
            hra = basic * 0.27;
            da = basic * 0.90;

        } else if (basic > 20200) {
            hra = basic * 0.36;
            da = basic * 0.95;


        }
        System.out.println(hra);
        gross = basic + hra + da;
        System.out.println("gross " + gross);
    }
}