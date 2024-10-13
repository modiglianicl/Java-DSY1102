
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
public class LatinBirdContainer {

    private ArrayList<String> latinBirds;

    public LatinBirdContainer() {
        this.latinBirds = new ArrayList<>();
    }

    public ArrayList<String> getLatinBirds() {
        return latinBirds;
    }

    public void setLatinBirds(ArrayList<String> latinBirds) {
        this.latinBirds = latinBirds;
    }

    public boolean addBird(String newBird) {
        if (!(this.latinBirds.contains(newBird))) {
            this.latinBirds.add(newBird);
            return true;
        } else {
            return false;
        }
    }

}
