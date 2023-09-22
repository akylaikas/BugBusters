package com.bugbusters.sprint3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIR15DataManagementTool {
    private List<String> collection = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FIR15DataManagementTool dataManagementTool = new FIR15DataManagementTool();
        dataManagementTool.run();
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            displayMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    addDataItem();
                    break;
                case 2:
                    removeDataItem();
                    break;
                case 3:
                    viewCollection();
                    break;
                case 4:
                    System.out.println("Exiting the tool. Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("Data Management Tool Menu:");
        System.out.println("1. Add an item");
        System.out.println("2. Remove an item");
        System.out.println("3. View the collection");
        System.out.println("4. Exit");
    }

    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private void addDataItem() {
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter the item's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the item's description: ");
        String description = scanner.nextLine();
        String itemDetails = "Name: " + name + ", Description: " + description;
        collection.add(itemDetails);
        System.out.println("Item added to the collection.");
    }

    private void removeDataItem() {
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter the name of the item to remove: ");
        String nameToRemove = scanner.nextLine();
        boolean removed = collection.removeIf(item -> item.contains("Name: " + nameToRemove));
        if (removed) {
            System.out.println("Item removed from the collection.");
        } else {
            System.out.println("Item not found in the collection.");
        }
    }

    private void viewCollection() {
        System.out.println("Current contents of the collection:");
        for (String item : collection) {
            System.out.println(item);
        }
    }
}




