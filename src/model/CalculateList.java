/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Validation;

/**
 *
 * @author Thao Chi
 */
public class CalculateList {
    public Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = Validation.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = Validation.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = Validation.checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Re-input");
            }
        }

    }

    public Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = Validation.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = Validation.checkInputDouble();
        return new Rectangle(width, length);
    }

    public Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = Validation.checkInputDouble();
        return new Circle(radius);
    }

    public void display(Triangle triangle, Rectangle rectangle, Circle circle) {
        System.out.println("------Rectangle------");
        rectangle.printResult();
        System.out.println("------Circle-------");
        circle.printResult();
        System.out.println("-------Triangle------");
        triangle.printResult();
    }

}
