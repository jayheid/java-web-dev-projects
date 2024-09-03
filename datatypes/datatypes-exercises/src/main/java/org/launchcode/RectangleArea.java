package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Provide the length of the rectangle: ");
        length = input.nextDouble();

        System.out.println("Provide the width of the rectangle: ");
        width = input.nextDouble();

        area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }
}
