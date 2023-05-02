package Garden;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GardenPlanner {

    Scanner input;
    GardenSizing gardenSizing;
    PlantManager plantManager;
    int numPlants;
    double totalCost;
    double soilDepth;
    double soilVolume;

    public GardenPlanner() {
        input = new Scanner(System.in);
        gardenSizing = new GardenSizing();
        plantManager = new PlantManager();
    }

    public void planGarden() {

        double area = gardenSizing.getArea();
        plantManager.plantPicker();

        numPlants = (int) Math.floor(area * plantManager.getPlantsPerSqM());
        totalCost = numPlants * plantManager.getCostPerPlant();
        soilDepth = 0.3; // 30 cm soil depth recommended
        soilVolume = area * soilDepth;

        System.out.printf("You can grow up to %d %s in your garden.%n", numPlants, plantManager.getPlantType());
        System.out.printf("The total cost for your garden is %.2f RON.%n", totalCost);
        System.out.printf("You will need %.2f cubic meters of soil for your garden.%n", soilVolume);

        // Save the results to a text file
        System.out.println("Please enter the name of the file to save the results to:");
        String filename = input.next();

        try (PrintWriter writer = new PrintWriter(new java.io.FileWriter(filename))) {
            writer.printf("You can grow up to %d %s in your garden.%n", numPlants, plantManager.getPlantType());
            writer.printf("The total cost for your garden is %.2f RON.%n", totalCost);
            writer.printf("You will need %.2f cubic meters of soil for your garden.%n", soilVolume);
            System.out.println("Results saved to file " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public int getNumPlants() {
        return numPlants;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getSoilDepth() {
        return soilDepth;
    }

    public double getSoilVolume() {
        return soilVolume;
    }
}