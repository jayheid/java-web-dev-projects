package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        double miles;
        double gallons;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();

        System.out.println("How much gas have you used (in gallons)?");
        gallons = input.nextDouble();

        mpg = miles /gallons;

        System.out.println("Current Miles-Per-Gallon: " + mpg);
    }
}
