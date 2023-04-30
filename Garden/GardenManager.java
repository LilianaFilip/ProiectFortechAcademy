package Garden;

import java.util.ArrayList;

public class GardenManager {

    private final ArrayList<Plant> plants;

    public GardenManager() {
        this.plants = new ArrayList<Plant>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void removePlant(int index) {
        plants.remove(index);
    }

    public void waterPlants() {
        for (Plant plant : plants) {
            plant.water();
        }
    }

    public void displayPlants() {
        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
}

