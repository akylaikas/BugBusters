package com.bugbusters.sprint3;
import java.util.ArrayList;
import java.util.Scanner;


public class FIR_14_ToDoListManagement {
    private ArrayList<String> tasks = new ArrayList<>();

    // Add a task
    public void addTask(String task) {
        tasks.add(task);
    }

    // Remove a task
    public boolean removeTask(String task) {
        return tasks.remove(task);
    }

    // View all tasks
    public void viewTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        FIR_14_ToDoListManagement manager = new FIR_14_ToDoListManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions: ");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter the task description: ");
                        String task = scanner.nextLine();
                        manager.addTask(task);
                        System.out.print("Want to add more tasks? (yes/no) ");
                        String response = scanner.nextLine();
                        if (response.equalsIgnoreCase("no")||response.equalsIgnoreCase("n")) {
                            break;
                        }
                        else if(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y")){

                        }
                        else{
                            System.out.println("Incorrect choice. Please choose (yes/no)");
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.print("Enter the task description to remove: ");
                        String task = scanner.nextLine();
                        if (manager.removeTask(task)) {
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Task not found!");
                        }
                        System.out.print("Want to remove more tasks? (yes/no) ");
                        String response = scanner.nextLine();
                        if (response.equalsIgnoreCase("no")||response.equalsIgnoreCase("n")) {
                            break;
                        }
                        else if(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y")){

                        }
                        else{
                            System.out.println("Incorrect choice. Please choose (yes/no)");
                            break;
                        }
                    }
                    break;
                case 3:
                    manager.viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}