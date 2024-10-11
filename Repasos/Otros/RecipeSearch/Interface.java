
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    private Scanner scanner;
//    private ArrayList<String> recipes;

    public Interface() {
    }

    public Interface(Scanner scanner) {
        this.scanner = scanner;
//        this.recipes = recipes;
    }

    public void start(){
        System.out.println("File to read:");
        String fileToRead = scanner.nextLine();
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            String userOption = scanner.nextLine();

            if (userOption.equals("list")) {
                System.out.println("");
                this.list(fileToRead);
            } else if (userOption.equals("find name")) {
                ArrayList<ArrayList<String>> info = this.getAll(fileToRead);
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();
                this.findRecipe(info, searchedWord);
            } else if (userOption.equals("stop")) {
                break;
            } else if (userOption.equals("find cooking time")) {
                ArrayList<ArrayList<String>> info = this.getAll(fileToRead);
                System.out.println("Max cooking time: ");
                int timeMax = Integer.parseInt(scanner.nextLine());
                this.findRecipeByCookingTime(info, timeMax);

            } else if (userOption.equals("find ingredient")) {
                ArrayList<ArrayList<String>> info = this.getAll(fileToRead);
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                this.findRecipeByIngredients(info, ingredient);
            } else {
                break;
            }
        }

    }

    public void list(String fileToRead) {
        try ( Scanner fileReader = new Scanner(Paths.get(fileToRead))) {
            System.out.println("Recipes:");
            int lineCounter = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    lineCounter = 0;
                    System.out.println("");
                    continue;
                }
                if (lineCounter >= 2) {
                    continue;
                }

                if (lineCounter == 1) {
                    System.out.print(", cooking time: ");
                }
                System.out.print(line);
                lineCounter++;
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public ArrayList<ArrayList<String>> getAll(String fileToRead) {

        try ( Scanner fileReader = new Scanner(Paths.get(fileToRead))) {
            ArrayList<ArrayList<String>> info = new ArrayList<>();
            ArrayList<String> recipeNames = new ArrayList<>();
            ArrayList<String> recipeTimes = new ArrayList<>();
            ArrayList<String> recipesIngredients = new ArrayList<>();
            String ingredients = "";
            int lineCounter = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    lineCounter = 0;
                    recipesIngredients.add(ingredients);
                    ingredients = "";
                    continue;
                }

                if (lineCounter >= 2) {
                    if (ingredients.equals("")) {
                        ingredients += line;
                        lineCounter++;
                    } else {
                        ingredients += "," + line;
                        lineCounter++;
                    }
                }

                if (lineCounter == 1) {
                    recipeTimes.add(line);
                    lineCounter++;
                }
                if (lineCounter == 0) {
                    recipeNames.add(line);
                    lineCounter++;
                }

            }
            recipesIngredients.add(ingredients); // Agregamos la ultima tanda de ingredientes debido al EoF
            fileReader.close(); // Cerramos scanner
            // Agregamos arrays al array
            info.add(recipeNames);
            info.add(recipeTimes);
            info.add(recipesIngredients);
            return info;
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
            return null;
        }
    }

    public void findRecipe(ArrayList<ArrayList<String>> info, String recipeToFind) {
        ArrayList<String> recipeNames = info.get(0);
        ArrayList<String> recipeTimes = info.get(1);
        // Empezamos busqueda
        System.out.println("Recipes: ");
        for (int i = 0; i < recipeNames.size(); i++) {
            if (recipeNames.get(i).toLowerCase().contains(recipeToFind.toLowerCase())) {
                System.out.println(recipeNames.get(i) + ", cooking time: " + recipeTimes.get(i));
            }
        }
    }

    public void findRecipeByCookingTime(ArrayList<ArrayList<String>> info, int time) {
        ArrayList<String> recipeNames = info.get(0);
        ArrayList<String> recipeTimes = info.get(1);
        // Empezamos busqueda
        System.out.println("Recipes: ");
        for (int i = 0; i < recipeTimes.size(); i++) {
            int recipeTime = Integer.parseInt(recipeTimes.get(i));
            if (recipeTime <= time) {
                System.out.println(recipeNames.get(i) + ", cooking time: " + recipeTimes.get(i));
            }

        }
    }

    public void findRecipeByIngredients(ArrayList<ArrayList<String>> info, String ingredient) {
        ArrayList<String> recipeNames = info.get(0);
        ArrayList<String> recipeTimes = info.get(1);
        ArrayList<String> recipeIngredients = info.get(2);
        System.out.println("Recipes: ");
        for (int i = 0; i < recipeIngredients.size(); i++) {
            String[] ingredients = recipeIngredients.get(i).split(",");
            for (int j = 0; j < ingredients.length; j++) {
                if (ingredients[j].equals(ingredient)) {
                    System.out.println(recipeNames.get(i) + ", cooking time: " + recipeTimes.get(i));
                }
            }
        }
    }

}
