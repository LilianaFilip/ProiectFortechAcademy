package Garden;

import java.util.Scanner;

public class PlantManager {
    Scanner input;
    double plantsPerSqM;
    double costPerPlant;
    String plantType;

    public PlantManager() {
        input = new Scanner(System.in);
    }

    public void plantPicker(){
        System.out.println("What type of plant do you want to grow in your garden?");
        System.out.println("1. Tomatoes");
        System.out.println("2. Carrots");
        System.out.println("3. Sunflowers");
        int choice = input.nextInt();

        plantsPerSqM = 0.0;
        costPerPlant = 0.0;
        plantType = "";
        if (choice == 1) {
            plantsPerSqM = 21.5; // 21.5 tomato plants per square meter
            costPerPlant = 0.5; // 0.5 RON per tomato plant
            plantType = "tomatoes";
        } else if (choice == 2) {
            plantsPerSqM = 232.0; // 232 carrot plants per square meter
            costPerPlant = 0.1; // 0.1 RON per carrot plant
            plantType = "carrots";
        } else if (choice == 3) {
            plantsPerSqM = 1.0; // 1 sunflower plant per square meter
            costPerPlant = 0.75; // 0.75 RON per sunflower plant
            plantType = "sunflowers";
        } else {
            System.out.println("Invalid choice. Exiting program.");
            System.exit(0);
        }
    }

    public double getCostPerPlant() {
        return costPerPlant;
    }

    public double getPlantsPerSqM() {
        return plantsPerSqM;
    }

    public String getPlantType() {
        return plantType;
    }
}
