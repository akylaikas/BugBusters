package com.bugbusters.sprint5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Plant {
    String name;
    String variety;
    String plantingDate;
    String careInstructions;

    Plant(String name, String variety, String plantingDate, String careInstructions) {
        this.name = name;
        this.variety = variety;
        this.plantingDate = plantingDate;
        this.careInstructions = careInstructions;
    }
}

public class GardenPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Plant> garden = new ArrayList<>();

        while (true) {
            System.out.println("Enter plant name (or type 'done' to finish):");
            String name = scanner.nextLine();
            if (name.toLowerCase().equals("done")) {
                break;
            }

            System.out.println("Enter plant variety:");
            String variety = scanner.nextLine();

            System.out.println("Enter planting date:");
            String plantingDate = scanner.nextLine();

            System.out.println("Enter care instructions:");
            String careInstructions = scanner.nextLine();

            garden.add(new Plant(name, variety, plantingDate, careInstructions));
        }

        System.out.println("\nYour Garden Layout:");
        for (Plant plant : garden) {
            System.out.println(plant.name + " (" + plant.variety + ") planted on: " + plant.plantingDate);
        }

        System.out.println("\nCare Reminders:");
        for (Plant plant : garden) {
            System.out.println(plant.name + " (" + plant.variety + "): " + plant.careInstructions);
        }
    }
}
