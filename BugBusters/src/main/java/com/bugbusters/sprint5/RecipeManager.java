import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RecipeManager {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<String, Recipe> recipes = new HashMap<>();

        while (true) {
            System.out.print("Enter a recipe name. Enter 'finished' if done entering the recipe names.");
            String recipeName = sc.nextLine();

            if (recipeName.equalsIgnoreCase("finished")) {
                break;
            }

            Recipe recipe = new Recipe();

            System.out.println("Enter the recipe ingredients and separate them by a comma. ");
            String ingredientLine = sc.nextLine();
            String[] ingredients = ingredientLine.split(",");
            for (String ingredient : ingredients) {
                recipe.addIngredient(ingredient.trim());
            }

            System.out.println("Enter the cooking instructions. Enter each cooking instruction on a new line. When your instructions are finished, type in the word 'done' on a new line. ");
            List<String> instructions = new ArrayList<>();
            while (true) {
                String instruction = sc.nextLine();
                if (instruction.equals("done")) {
                    break;
                }
                instructions.add(instruction);
            }

            recipe.setName(recipeName);
            recipe.setInstructions(instructions);

            recipes.put(recipeName, recipe);
        }

        while (true) {
            System.out.print("You can now search for a recipe by name and view details of each recipe. To quit this tool type in 'quit' in a new line.");
            String searchName = sc.nextLine();

            if (searchName.equalsIgnoreCase("quit")) {
                break;
            }

            Recipe foundRecipe = recipes.get(searchName);

            if (foundRecipe != null) {
                System.out.println("We found your recipe!");
                System.out.println("Name: " + foundRecipe.getName());
                System.out.println("Ingredients: " + foundRecipe.getIngredients());
                System.out.println("Instructions:");
                for (String instruction : foundRecipe.getInstructions()) {
                    System.out.println(instruction);
                }
            } else {
                System.out.println("Recipe not found, please try again to enter the recipe name.");
            }
        }

    }
}

class Recipe {
    private String name;
    private List<String> ingredients;
    private List<String> instructions;

    public Recipe() {
        ingredients = new ArrayList<>();
        instructions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }
}
