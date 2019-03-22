package com.skg.examples;

import java.util.Scanner;

/**
 * Program to print required number of fibonacci series
 * eg: 1 1 2 3 5 8 13 21 34
 * RECURSIVE METHOD
 */

public class FibonacciSeriesRecursive {

    public static void main(String[] args) {
        System.out.println("*** PROGRAM TO PRINT FIBONACCI SERIES ***\n");
        System.out.print("ENTER REQUIRED NUMBER OF FIBONACCI SERIES TO PRINT (Enter 0 to Quit): ");
        int maxNum;
        Scanner scan = new Scanner(System.in);
        while ((maxNum = scan.nextInt()) != 0) {
            for (int i = 1; i <= maxNum; i++) {
                System.out.print(returnFibonacciNumber(i) + " ");
            }
            System.out.print("\n\nENTER REQUIRED NUMBER OF FIBONACCI SERIES TO PRINT (Enter 0 to Quit): ");
        }
    }

    /**
     * Method to get the fibonacci number
     * Recursive Method
     */
    private static int returnFibonacciNumber(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return (returnFibonacciNumber(num - 1) + returnFibonacciNumber(num - 2));
    }
}
