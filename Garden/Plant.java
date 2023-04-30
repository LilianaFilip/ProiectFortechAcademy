package Garden;

public class Plant {
    private final String name;
    private int waterLevel;

    public Plant(String name, int waterLevel) {
        this.name = name;
        this.waterLevel = waterLevel;
    }

    public void water() {
        waterLevel++;
    }

    public String getName() {
        return name;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    @Override
    public String toString() {
        return name + " - Water level: " + waterLevel;
    }
}