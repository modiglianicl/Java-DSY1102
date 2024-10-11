
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
public class PointsContainer {

    ArrayList<Integer> points;

    public PointsContainer() {
        this.points = new ArrayList<>();
    }

    public void addPoint(int newPoint) {
        this.points.add(newPoint);
    }

    public double averagePoints() {
        double total = 0;
        double average = 0;
        for (Integer tempInt : this.points) {
            total += tempInt;
        }

        average = total / this.points.size();

        return average;
    }

    public double averagePassingPoints() {
        double total = 0;
        double average = 0;
        double counter = 0;
        for (Integer tempInt : this.points) {
            if (tempInt >= 50) {
                total += tempInt;
                counter++;
            }
        }

        average = total / counter;
        if(counter == 0.0){
            return 0.0;
        }

        return average;
    }

    public double passingPercentage() {
        double passing = 0;
        double counter = 0;
        for (Integer tempInt : this.points) {
            if (tempInt >= 50) {
                passing++;
                counter++;
            }
        }

        passing = counter / this.points.size() * 100;

        return passing;
    }
    
    public void gradeDistribution(){
        int startingGrade = 5;
        while(startingGrade >= 0){
            System.out.print(startingGrade+":");
            for(Integer tempInt : this.points){
                if(this.pointsToGrade(tempInt) == startingGrade){
                    System.out.print("*");
                }
            }
            System.out.println("");
            startingGrade--;
        }
    }
    
    public double pointsToGrade(double points){
        if(points < 50){
            return 0;
        } else if(points < 60){
            return 1.0;
        } else if(points < 70){
            return 2.0;
        } else if(points < 80){
            return 3.0;
        } else if(points < 90){
            return 4.0;
        } else if(points >= 90){
            return 5.0;
        }
        
        return 0;
    }

}
