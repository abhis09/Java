package com.assignment.task7;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter string:");
   boolean b= true;
        String str= sc.nextLine();

       for(char i:str.toCharArray())
       {
           if(str.indexOf(i)==str.lastIndexOf(i))
           {
               System.out.println("first non-repeated character in the string"+i);
              b=false;
              break;
           }
       }


       if (b)
        System.out.println("no non-repeating character");


    }

}
