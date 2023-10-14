package com.bugbusters.sprint3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FIR_26_Mariana {
    public static void main(String[] args) {
        List<WordPair> wordPairs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Language Learning Tool!");
        System.out.println("Enter 'done' when you're finished adding words.\n");

        while (true) {
            System.out.print("Enter a native language word (or 'done' to finish): ");
            String nativeWord = scanner.nextLine();

            if (nativeWord.equalsIgnoreCase("done")) {
                break;
            }

            // Check if the native word is empty (including whitespace)
            if (nativeWord.trim().isEmpty()) {
                System.out.println("Native word cannot be empty. Please try again.");
                continue;
            }

            String targetWord = "";
            while (targetWord.trim().isEmpty()) {
                System.out.print("Enter the corresponding target language word: ");
                targetWord = scanner.nextLine();

                if (targetWord.trim().isEmpty()) {
                    System.out.println("Target word cannot be empty. Please try again.");
                }
            }

            wordPairs.add(new WordPair(nativeWord, targetWord));
        }

        System.out.println("\nYou've added the following word pairs:");
        for (WordPair pair : wordPairs) {
            System.out.println(pair.getNativeWord() + " - " + pair.getTargetWord());
        }

        Collections.shuffle(wordPairs);

        System.out.println("\nLet's start the quiz!\n");

        int score = 0;
        for (WordPair pair : wordPairs) {
            System.out.print("What is the target word for '" + pair.getNativeWord() + "': ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(pair.getTargetWord())) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is '" + pair.getTargetWord() + "'.\n");
            }
        }

        System.out.println("Quiz completed. Your score: " + score + " out of " + wordPairs.size());
    }
}

class WordPair {
    private String nativeWord;
    private String targetWord;

    public WordPair(String nativeWord, String targetWord) {
        this.nativeWord = nativeWord;
        this.targetWord = targetWord;
    }

    public String getNativeWord() {
        return nativeWord;
    }

    public String getTargetWord() {
        return targetWord;
    }
}