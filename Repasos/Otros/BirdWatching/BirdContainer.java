
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chuck
 */
public class BirdContainer {

    private ArrayList<String> birds;

    public BirdContainer() {
        this.birds = new ArrayList<>();
    }

    public ArrayList<String> getBirds() {
        return birds;
    }

    public void setBirds(ArrayList<String> birds) {
        this.birds = birds;
    }

    public boolean addBird(String newBird) {
        if (!(this.birds.contains(newBird))) {
            this.birds.add(newBird);
            return true;
        } else {
            return false;
        }
    }

}
