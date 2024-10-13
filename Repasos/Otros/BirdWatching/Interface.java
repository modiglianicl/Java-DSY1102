
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chuck
 */
public class Interface {

    private BirdContainer birds;
    private LatinBirdContainer latinBirds;
    private ArrayList<Integer> birdCount;
    private Scanner scanner;

    public Interface(BirdContainer birds, LatinBirdContainer latinBirds, Scanner scanner) {
        this.birds = birds;
        this.latinBirds = latinBirds;
        this.scanner = scanner;
        this.birdCount = new ArrayList<>();
    }

    public void start() {
        String userOption;

        do {
            System.out.println("?");
            userOption = scanner.nextLine();

            if (userOption.equals("Add")) {
                this.addBird();
            } else if (userOption.equals("Observation")) {
                this.addObservation();
            } else if (userOption.equals("All")) {
                this.allBirds();
            } else if (userOption.equals("One")) {
                this.oneBird();
            } else if (userOption.equals("Quit")) {
                break;
            } else {
                System.out.println("Error, please refer to the manual for the commands.");
            }
        } while (true);

    }

    public void addBird() {
        String birdName;
        String latinBirdName;

        // Bird name
        while (true) {
            System.out.println("Name: ");
            birdName = scanner.nextLine();
            if (birdName.isEmpty()) {
                System.out.println("Name must contain at least 1 letter.");
            } else {
                break;
            }
        }
        // Latin bird name
        while (true) {
            System.out.println("Name in Latin: ");
            latinBirdName = scanner.nextLine();
            if (birdName.isEmpty()) {
                System.out.println("Latin name must contain at least 1 letter.");
            } else {
                break;
            }
        }

        // Adding bird name and latin name and his count to current index
        if (this.birds.addBird(birdName)) {
            this.latinBirds.addBird(latinBirdName);
            this.birdCount.add(0);
            System.out.println("Bird added!");
        }

    }

    public void addObservation() {
        String birdName;
        boolean exists = false;

        while (true) {
            System.out.println("Bird?");
            birdName = scanner.nextLine();

            if (birdName.isEmpty()) {
                System.out.println("Please input a bird name");
                continue;
            }

            ArrayList<String> birds = this.birds.getBirds();
            for (int i = 0; i < birds.size(); i++) {
                if (birds.get(i).equals(birdName)) {
                    exists = true;
                    Integer currentCount = this.birdCount.get(i);
                    this.birdCount.set(i, currentCount + 1);
                    break;
                }
            }
            break;

        }

        if (!(exists)) {
            System.out.println("Not a bird!");
        }
    }

    public void allBirds() {
        ArrayList<String> birds = this.birds.getBirds();
        ArrayList<String> latinBirds = this.latinBirds.getLatinBirds();
        for (int i = 0; i < birds.size(); i++) {
            System.out.println(birds.get(i) + " (" + latinBirds.get(i) + "): " + this.birdCount.get(i) + " observations");
        }
    }

    public void oneBird() {
        ArrayList<String> birds = this.birds.getBirds();
        ArrayList<String> latinBirds = this.latinBirds.getLatinBirds();
        String birdName;

        while (true) {
            System.out.println("Bird?");
            birdName = scanner.nextLine();

            if (birdName.isEmpty()) {
                System.out.println("Not a bird!");
                break;
            }
             // Podria crear un metodo que revisa si exsite o no el pajaro...
            for (int i = 0; i < birds.size(); i++) {
                if (birds.get(i).equals(birdName)) {
                    System.out.println(birds.get(i) + " (" + latinBirds.get(i) + "): " + this.birdCount.get(i) + " observations");
                    break;
                }
            }
            break;
        }
    }
}
