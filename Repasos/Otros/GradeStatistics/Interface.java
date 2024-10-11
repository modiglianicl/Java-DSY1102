
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
    private Scanner scanner;
    private PointsContainer points;

    public Interface(Scanner scanner,PointsContainer points) {
        this.scanner = scanner;
        this.points = points;
    }
    
    public void start(){
        int point;
        do {
            System.out.println("Enter point totals, -1 stops:");
            point = Integer.parseInt(scanner.nextLine());
            
            if(point == -1){
                break;
            } else if(point < 0 || point > 100){
                continue;
            }
            
            this.points.addPoint(point);
            
        } while (true);
        System.out.println("Point average (all): " + this.points.averagePoints());
        System.out.println("Points average (passing) : " + this.points.averagePassingPoints());
        System.out.println("Pass percentage: " + this.points.passingPercentage());
        System.out.println("Grade distribution:");
        this.points.gradeDistribution();
    }
}
