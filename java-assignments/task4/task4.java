package com.assignment.task4;

public class task4 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {2, 3, 4}, {7, 8, 9}};
        int[][] arr2 = {{4, 5, 6}, {7, 8, 9}, {4, 5, 6}};

        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(c[i][j] + " ");
            }
            System.out.println();


        }
    }
}
