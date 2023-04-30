package Utils;

import java.util.Scanner;

public class UserInput {

    private final Scanner input;

    public UserInput() {
        input = new Scanner(System.in);
    }

    private int selectedOption;

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public void requestUserInput() {
        setSelectedOption(input.nextInt());
    }
}
