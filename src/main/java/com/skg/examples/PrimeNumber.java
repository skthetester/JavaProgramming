package com.skg.examples;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("*** PROGRAM TO FIND IF GIVEN NUMBER IS PRIME ***");
        System.out.print("\n\nENTER NUMBER: ");
        Scanner scan = new Scanner(System.in);
        int numToCheck = scan.nextInt();
        Boolean isPrime = true;

        if (numToCheck <= 3) {
            isPrime = true;
        } else {
            FOR_LOOP:
            for (int i = 2; i <= numToCheck / 2; i++) {
                if (numToCheck % i == 0) {
                    isPrime = false;
                    break FOR_LOOP;
                } else {
                    isPrime = true;
                }
            }
        }

        if (isPrime) {
            System.out.println("\n Number " + numToCheck + " is Prime.");
        } else {
            System.out.println("\n Number " + numToCheck + " is not Prime.");
        }
    }

}
