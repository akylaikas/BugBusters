package com.bugbusters.sprint2;

import java.util.Scanner;

public class Fir_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program will prompt you to enter two words(words are considered to only have letter characters), " +
                "and tell you if they are anagrams or not.");
        System.out.println("Please Enter first word:");
        String firstWord = input.nextLine();

        if (!isInputValid(firstWord)) {
            System.out.println("You have entered an invalid input.");
        } else {
            System.out.println("Please Enter the second word:");
            String secondWord = input.nextLine();

            if (!isInputValid(secondWord)) {
                System.out.println("You have entered an invalid input.");
            } else {
                if (isAnagram(firstWord, secondWord)) {
                    System.out.println("Your words are anagrams.");
                } else {
                    System.out.println("Your words are not anagrams.");
                }

            }

        }

    }


    private static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() == secondWord.length()) {
            String firstWordLowerCase = firstWord.toLowerCase();
            String secondWordLowerCase = secondWord.toLowerCase();

            for (int i = 0; i < secondWordLowerCase.length(); i++) {
                char currentCharSecondWord = secondWordLowerCase.charAt(i);

                if (firstWordLowerCase.indexOf(currentCharSecondWord) == -1) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

    private static boolean isInputValid(String word) {
        if (word == null || word.trim().isEmpty()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (!Character.isLetter(currentChar)) {
                return false;

            }

        }

        return true;
    }
}



