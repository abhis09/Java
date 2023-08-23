package com.assignment.task4;

import java.util.Scanner;

public class task6 {
    Scanner sc = new Scanner(System.in);

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array={2,5,6,8,45,56,75,84,93};

        int target= 94;
        boolean result= binarySearch(array,target);
        if(result){
            System.out.println("it is present");
            
        }
        else{
            System.out.println("not present");
        }
    }
}
