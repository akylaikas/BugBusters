package com.bugbusters.sprint3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueNumberListTool {
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
