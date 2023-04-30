import Garden.GardenManager;
import Utils.ScenarioManager;
import Utils.UserInput;

import java.util.Scanner;

public class Main {

    static ScenarioManager scenarioManager = new ScenarioManager();
    static UserInput userInput = new UserInput();
    GardenManager app = new GardenManager();

    public static void main(String[] args) {
        scenarioManager.scenarioBuilder("GreetingScenario");
    }


}
