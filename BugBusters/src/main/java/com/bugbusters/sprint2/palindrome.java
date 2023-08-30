package com.bugbusters.sprint2;

import java.util.Scanner;

public class palindrome {
    private static int i;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");

        String givenWord = sc.nextLine();
        givenWord = givenWord.replaceAll("\\s+", "").toLowerCase();

        String reverse = "";

        for (int i = givenWord.length() - 1; i >= 0; i--) {
            reverse += givenWord.charAt(i);
        }

        boolean isPalindrome = givenWord.equals(reverse);

        if (isPalindrome) {
            System.out.println("The given word/phrase is a palindrome!");
        } else {
            System.out.println("The given word/phrase is not a palindrome!");
        }
    }
}
