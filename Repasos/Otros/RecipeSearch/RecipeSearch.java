
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner fileReader;
        
//        try(Scanner fileReader = new Scanner(Paths.get("recipes.txt"))){
//            while(fileReader.hasNextLine()){
//                String row = fileReader.nextLine();
//                System.out.println(row);
//            }
//        } catch(Exception e){
//            System.out.println("Error: " + e.getMessage());
//        }
        Interface ui = new Interface(scanner);
        ui.start();
    }

}
