package controller;

import java.util.Scanner;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import model.CalculateList;
import view.Menu;

public class CalculateManager extends Menu<String> {
    private Triangle triangle;
    private Circle circle;
    private CalculateList calculateList;

    public CalculateManager(String title, String[] s, Triangle triangle, Circle circle) {
        super(title, s);
        this.triangle = triangle;
        this.circle = circle;
        this.calculateList = new CalculateList();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                Triangle inputTriangle = calculateList.inputTriangle();
                Rectangle inputRectangle = calculateList.inputRectangle();
                Circle inputCircle = calculateList.inputCircle();

                calculateList.display(inputTriangle, inputRectangle, inputCircle);
                break;

            case 2:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }

    
}