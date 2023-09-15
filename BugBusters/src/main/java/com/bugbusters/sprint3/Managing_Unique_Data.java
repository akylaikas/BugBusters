package com.bugbusters.sprint3;

import java.util.*;


/**
 * Given an interactive menu of options to add, remove, view, or perform unique data operations on items,
 * <p>
 * When I choose to add an item and provide its details,
 * <p>
 * Then the tool should add the item to the collection, ensuring that only unique items are stored.
 * <p>
 * And the tool should ask if I want to add more items, allowing me to repeat the process until I indicate that I'm done.
 * <p>
 * When I choose to remove an item and provide its identifier,
 * <p>
 * Then the tool should remove the item from the collection.
 * <p>
 * And the tool should ask if I want to remove more items, allowing me to repeat the process until I indicate that I'm done.
 * <p>
 * When I choose to view the collection,
 * <p>
 * Then the tool should display the current contents of the collection.
 * <p>
 * And when I choose to perform a unique data operation (e.g., find unique items or calculate the number of unique items),
 * <p>
 * Then the tool should execute the selected operation and display the result.
 * <p>
 * And the tool should ask if I want to perform more unique data operations or return to other actions (add, remove, view, modify, or exit).
 */

public class Managing_Unique_Data {
    public static void main(String[] args) {
        Set<String> collection = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addItem(collection, scanner);
                    break;
                case 2:
                    removeItem(collection, scanner);
                    break;
                case 3:
                    viewCollection(collection);
                    break;
                case 4:
                    performUniqueDataOperation(collection, scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add an item");
        System.out.println("2. Remove an item");
        System.out.println("3. View the collection");
        System.out.println("4. Perform a unique data operation");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addItem(Set<String> collection, Scanner scanner) {
        System.out.print("Enter the item to add: ");
        String item = scanner.nextLine();
        if (collection.add(item)) {
            System.out.println("Item added successfully.");
        } else {
            System.out.println("Item is already in the collection.");
        }
        askToAddMore(scanner);
    }

    private static void removeItem(Set<String> collection, Scanner scanner) {
        System.out.print("Enter the item to remove: ");
        String item = scanner.nextLine();
        if (collection.remove(item)) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found in the collection.");
        }
        askToRemoveMore(scanner);
    }

    private static void viewCollection(Set<String> collection) {
        System.out.println("Collection contents: " + collection);
    }

    private static void performUniqueDataOperation(Set<String> collection, Scanner scanner) {
        System.out.println("Choose a unique data operation:");
        System.out.println("1. Find unique items");
        System.out.println("2. Calculate the number of unique items");
        System.out.print("Enter your choice: ");
        int operationChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (operationChoice) {
            case 1:
                System.out.println("Unique items: " + collection);
                break;
            case 2:
                System.out.println("Number of unique items: " + collection.size());
                break;
            default:
                System.out.println("Invalid operation choice.");
        }
        askToPerformMoreOperations(scanner);
    }

    private static void askToAddMore(Scanner scanner) {
        System.out.print("Do you want to add more items? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();
        if (!response.equals("yes")) {
            System.out.println("Returning to the main menu.");
        }
    }

    private static void askToRemoveMore(Scanner scanner) {
        System.out.print("Do you want to remove more items? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();
        if (!response.equals("yes")) {
            System.out.println("Returning to the main menu.");
        }
    }

    private static void askToPerformMoreOperations(Scanner scanner) {
        System.out.print("Do you want to perform more unique data operations? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();
        if (!response.equals("yes")) {
            System.out.println("Returning to the main menu.");
        }
    }
}


