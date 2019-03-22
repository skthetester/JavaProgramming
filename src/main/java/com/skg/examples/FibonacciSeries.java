package com.skg.examples;

import java.util.Scanner;

/**
 * Program to print required number of fibonacci series
 * eg: 1 1 2 3 5 8 13 21 34
 */
public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("*** PROGRAM TO PRINT FIBONACCI SERIES ***\n");
        System.out.print("ENTER REQUIRED NUMBER OF FIBONACCI SERIES TO PRINT: ");
        Scanner scan = new Scanner(System.in);
        int maxNum = scan.nextInt();

        for (int i = 1; i <= maxNum; i++) {
            System.out.print(returnFibonacciNumber(i) + " ");
        }

    }

    /**
     * Method to get the fibonacci number
     *
     * @return fbNum
     */
    private static int returnFibonacciNumber(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }

        int fb1 = 1, fb2 = 1, fx = 1;
        for (int i = 3; i <= num; i++) {
            fx = fb1 + fb2;
            fb1 = fb2;
            fb2 = fx;
        }
        return fx;

    }

}
