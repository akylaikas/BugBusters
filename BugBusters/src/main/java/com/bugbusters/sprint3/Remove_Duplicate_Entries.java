package com.bugbusters.sprint3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an interactive prompt to input a list of numbers,
 * <p>
 * When I provide the list of numbers one by one,
 * <p>
 * Then the tool should process the input to remove duplicates.
 * <p>
 * And the tool should return a new list with only the unique numbers, maintaining the original order of appearance.
 * <p>
 * And the original list remains unchanged.
 * <p>
 * And the tool should ask, "Do you want to add another number?" until I indicate that I'm done entering numbers.
 */

public class Remove_Duplicate_Entries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> originalList = new ArrayList<>();
        List<Integer> uniqueList = new ArrayList<>();

        System.out.println("Welcome to the Unique Number List Tool!");
        System.out.println("Enter your numbers one by one or 'done' to finish:");
        String input;
        while (true) {
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("done") || input.equalsIgnoreCase("d")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                originalList.add(number);

                if (!uniqueList.contains(number)) {
                    uniqueList.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
            }
        }

        System.out.println("List of unique numbers: " + uniqueList);
        System.out.println("Original list: " + originalList);

        while (true) {
            System.out.println("Do you want to add another number? (yes/no):");
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                System.out.println("Enter the number to add:");
                input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("done") || input.equalsIgnoreCase("d")) {
                    break;
                }

                try {
                    int number = Integer.parseInt(input);
                    originalList.add(number);

                    if (!uniqueList.contains(number)) {
                        uniqueList.add(number);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
                }
            } else if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }
        }
        System.out.println("List of unique numbers: " + uniqueList);
        System.out.println("Original list: " + originalList);
    }
}
