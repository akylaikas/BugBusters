package com.bugbusters.sprint2;

import java.util.Scanner;

public class FIR_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("The Fibonacci Sequence is the series of whole positive numbers where the next number is found by adding up the two numbers before it. \nGive it a try!");
        double number = 0; //changed to double
        do {
            System.out.println("Enter a number to use as an upper limit. The Fibonacci Sequence will be generated up to that number.");
            number = in.nextDouble(); //changed in.nextInt -> in.nextDouble
            if (number % 1 != 0 || number < 0) {
                System.err.println("The The Fibonacci Sequence only works with positive whole numbers, please enter a positive integer.");
            }
            else {
                System.out.println("The Fibonacci Sequence is: ");
                int i = 0;
                int f0 = 0;
                int f1 = 1;
                int fn;
                double value = 0; // changed this to double which is redundant since value is not used
                do {
                    fn = f0 + f1;
                    System.out.print(f0 + " ");
                    f0 = f1;
                    f1 = fn;
                    value = number - f0;
                    i++;
                } while (f0 <= number);
            }
        }
        while (number < 0 || number % 1 != 0) ;
    }
}

