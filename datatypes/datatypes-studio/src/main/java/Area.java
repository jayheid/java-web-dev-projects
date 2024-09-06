import org.launchcode.Circle;

import java.util.Scanner;

public class Area {
    public static void main (String[] Args){
        Scanner input;
        // double pi = ;
        double radius;
        double area;


        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        // area = Math.PI * Math.pow(radius,2);
        while (radius < 0) {
            System.out.println("Enter a VALID radius: ");
            radius = input.nextDouble();
        }

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area + "cm\u00B2");

        /*
        if (radius > 0){
            area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area + "cm\u00B2");
        }
        else{
            System.out.println("Invalid input!");
        }
        */

        input.close();
    }
}
