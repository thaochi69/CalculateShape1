
import controller.CalculateManager;
import model.Circle;
import model.Triangle;
import model.Rectangle;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thao Chi
 */
public class Main {
     public static void main(String[] args) {
        String title = "=====Calculator Shape Program=====";
        String[] s = new String[]{"Calculate and Display", "Exit"};
        
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rec = new Rectangle();

        CalculateManager manager = new CalculateManager(title, s, triangle, circle);
        manager.run();
    }
    }

