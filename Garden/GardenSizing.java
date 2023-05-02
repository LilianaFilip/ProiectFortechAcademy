package Garden;

import java.util.Scanner;

public class GardenSizing {

    Scanner input;

    public GardenSizing() {
        input = new Scanner(System.in);
    }

    public double getArea(){

        System.out.println("Please enter the length of your garden in meters: ");
        double length = input.nextDouble();

        System.out.println("Please enter the width of your garden in meters: ");
        double width = input.nextDouble();

        double area = length * width;

        return area;
    }
}
