package com.assignment.task5;

import java.util.Arrays;
import java.util.Scanner;

public class task3
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        System.out.println("enter a second string");
        String s2=sc.nextLine();

        String str1= s1.toLowerCase();
        String str2=s2.toLowerCase();

        if(str1.length()==str2.length()) {

            char[] chararr1 = str1.toCharArray();
            char[] chararr2 = str2.toCharArray();

            Arrays.sort(chararr1);
            Arrays.sort(chararr2);

            //   System.out.println(chararr1[0]);
            boolean result = Arrays.equals(chararr1, chararr2);

            if (result) {
                System.out.println(str1 + "  and " + str2 + " are anagram");

            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram");
            }
        }
            else{
                System.out.println(str1+ " and "+ str2+" are not anagram");
            }
        }

    }
