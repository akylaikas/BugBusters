package com.bugbusters.sprint2;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);

        if (reversedString == null) {
            System.out.println("Invalid input. Please provide a valid string.");
        } else {
            System.out.println("Reversed String: " + reversedString);
        }
    }

    public static String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}


