package view;

import java.util.ArrayList;
import common.Validation; // Assuming you have a Validation class for input validation

public abstract class Menu<String> {
    private String title;
    private ArrayList<String> options;

    public Menu(String title, String[] options) {
        this.title = title;
        this.options = new ArrayList<>();
        for (String option : options) {
            this.options.add(option);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("--------------------------------");
    }

    public int getSelected() {
        display();
        System.out.print("Enter your choice: ");
        int choice = -1;
        try {
            choice = Validation.checkInputIntLimit(1, options.size());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid choice.");
        }
        return choice;
    }

    public abstract void execute(int choice);

    public void run() {
        while (true) {
            int choice = getSelected();
            if (choice < 0) {
                break;
            }
            execute(choice);
        }
    }
}