package Utils;

import java.util.*;

public class ScenarioManager {

    private int selectedScenario;
    private ArrayList<String> currentScenario;
    private String scenarioTitle;
    private final ArrayList<String> scenarioContent;
    private final ArrayList<String> selectableOptions;
    private final UserInput userInput;
    public Map<String, String> scenarioList;

    public ScenarioManager() {
        userInput = new UserInput();
        scenarioContent = new ArrayList<String>();
        selectableOptions = new ArrayList<String>();
        scenarioList = new HashMap<String, String>();
        createScenarioList();
    }

    private void createScenarioList(){
        scenarioList.put("GreetingScenario", greetingScenario());
    }

    public Map<String, String> getScenarioList(){
        return this.scenarioList;
    }

    private static String[] generateMenuOptions(int numOptions) {
        String[] menuOptions = new String[numOptions];
        for (int i = 0; i < numOptions; i++) {
            menuOptions[i] = "Option " + (i+1);
        }
        return menuOptions;
    }

    public void scenarioBuilder(String selectedScenario){

        getScenarioList();

        int choice;

        String[] menuOptions = generateMenuOptions(selectableOptions.size());
        do {
            System.out.println("========== Menu ==========");

            for (int i = 0; i <= menuOptions.length; i++) {
                System.out.println(scenarioContent.get(i));
            }

            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println((i+1) + ". " + selectableOptions.get(i));
            }

            System.out.println((menuOptions.length + 1) + ". Exit");

            System.out.print("Enter your choice: ");
            userInput.requestUserInput();
            choice = userInput.getSelectedOption();

            System.out.println(choice);

            if (choice >= 1 && choice <= menuOptions.length) {
                System.out.println("You chose " + selectableOptions.get(choice - 1));
            } else if (choice == menuOptions.length + 1) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice, please try again.");
            }
            System.out.println();

        } while (choice != menuOptions.length + 1);
    }

    private String greetingScenario(){
        scenarioTitle = "Greetings!";

        scenarioContent.add(scenarioTitle);
        scenarioContent.add("Something, something, line 1.");
        scenarioContent.add("Something, something, line 2.");
        scenarioContent.add("Something, something, line 3.");

        selectableOptions.add("First option on the Greeting screen.");
        selectableOptions.add("Second option on the Greeting screen.");
        selectableOptions.add("Third option on the Greeting screen.");

        return String.valueOf(scenarioContent);
    }

    private String testScenario(){
        scenarioTitle = "Greetings!";

        scenarioContent.add(scenarioTitle);
        scenarioContent.add("Test, line 1.");
        scenarioContent.add("Test, line 2.");
        scenarioContent.add("Test, line 3.");

        return String.valueOf(scenarioContent);
    }
}
