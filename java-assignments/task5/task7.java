package com.assignment.task5;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();

        boolean signal;

        signal = searchTheString(str);
        System.out.println(signal);

        String str1 = reverseString(str);
        System.out.println(str1);

    }

public static boolean searchTheString(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }

            }

          }
        return true;
    }


    public static String reverseString(String str)
    {
      String[] words = str.split(" ");
      StringBuilder rev=new StringBuilder();

      for(String word:words)
      {
          StringBuilder revwords=new StringBuilder(word).reverse();
          rev.append(revwords).append(" ");
      }
      return rev.toString();
    }

}
