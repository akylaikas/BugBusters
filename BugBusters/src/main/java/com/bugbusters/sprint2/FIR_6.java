package com.bugbusters.sprint2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FIR_6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Fibonacci Sequence Generator!");

            while (true) {
                System.out.println("Enter a positive integer as the upper limit (or 'done' to exit): ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("done")) {
                    System.out.println("Thanks for using our Fibonacci Sequence generator. Goodbye!");
                    break;
                }

                try {
                    int limit = Integer.parseInt(input);
                    if (limit <= 0) {
                        System.err.println("Invalid input. Please enter a positive integer.");
                        continue;
                    }

                    List<Integer> fibonacciSequence = generateFibonacciSequence(limit);
                    System.out.println("Fibonacci sequence up to " + limit + ":");
                    for (int number : fibonacciSequence) {
                        System.out.print(number + " ");
                    }
                    System.out.println();

                } catch (NumberFormatException e) {
                    System.err.println("Invalid input. Please enter a valid positive integer.");
                }
            }

            scanner.close();
        }

        public static List<Integer> generateFibonacciSequence(int limit) {
            List<Integer> fibonacciSequence = new ArrayList<>();
            int a = 0, b = 1, next = 0;

            while (a <= limit) {
                fibonacciSequence.add(a);
                next = a + b;
                a = b;
                b = next;
            }

            return fibonacciSequence;
        }
    }

