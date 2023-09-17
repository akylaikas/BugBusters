package com.bugbusters.sprint3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FIR_14_ToDoListManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        taskWorks dataM = new taskWorks();
        String date = "09/17/2023";

        while(true){
            System.out.println("Please choose form the menu:\n" +
                    "1. Add a task\n" +
                    "2. Remove a task\n" +
                    "3. View a task\n"+
                    "4. Exit");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("4")){
                System.out.println("Bye bye!");
                break;
            }
            switch (input){
                case "1":
                    System.out.println("You chose to add a task!");
                    System.out.println("Enter task title:");
                    String task_name = sc.nextLine();
                    System.out.println("Enter task description:");
                    String task_dec = sc.nextLine();
                    dataM.add(new task_repository(task_name, task_dec, date));
                    break;
                case "2":
                    System.out.println("You chose to remove a task!");
                    break;
                case "3":
                    System.out.println("You chose to view a task!");
                    System.out.println("Enter task title:");
                    task_name = sc.nextLine();
                    System.out.println(dataM.view(task_name).getTask_name()+"\n"+
                            dataM.view(task_name).getTask_description()+"\n"+
                            dataM.view(task_name).getDate());
                    break;

            }
        }


    }
}

class taskWorks{
    private List<task_repository> taskList = new ArrayList<>();

    public List<task_repository> getTaskList() {
        return taskList;
    }

    /*public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public Customer findCustomer(String customerId){
        for(Customer customer: customerList){
            if(customer.getCustomerId().equals(customerId)){
                return customer;
            }
        }

        return null;
    }*/

    public void add(task_repository taskRep){
        if(taskList.contains(taskRep.getTask_name())){
            System.out.println("Task with this name exists!");}
        else{
            taskList.add(taskRep);
            System.out.println("Successfully added!");
        }

    }

    public void remove(){

    }

    public task_repository view(String task_name){
        for(task_repository task: taskList){
            if(task.getTask_name().equalsIgnoreCase(task_name)){
                return task;
            }
        }
        return null;
    }
}

class task_repository{
    private static int task_id=100;
    private String task_name;
    private String date;
    private String task_description;

    public task_repository() {
        this.task_name = task_name;
        this.date = date;
        this.task_description = task_description;
        this.task_id++;
    }
    public task_repository(String task_name, String date, String task_description) {
        this.task_name = task_name;
        this.date = date;
        this.task_description = task_description;
        this.task_id++;
    }

    public static int getTask_id() {
        return task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getDate() {
        return date;
    }

    public String getTask_description() {
        return task_description;
    }

    //Which variables?
    //Date entered, user entered, list of tasks, is it completed or not(maybe MAP)
    //task description



}