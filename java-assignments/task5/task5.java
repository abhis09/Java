package com.assignment.task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        int count = 0;
        int count1 = 0;


        String str = sc.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count1++;
            }
        }

            System.out.println("vowel is" + count);
            System.out.println("consonant is" + count1);
        }
    }


