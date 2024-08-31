/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.evaluation.calc;
/**
 *
 * @author bryan
 */
abstract class Shape {

    protected String color;
    protected boolean hasFill;

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle extends Shape {

    private double radius;
    private double pi = 22 / 7;

    Circle(String color, boolean hasFill, double radius) {
        this.color = color;
        this.hasFill = hasFill;
        this.radius = radius;
    }

    @Override
     double calculateArea() {
        double area = pi * Math.pow(radius, 2);
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * pi * radius;
        return perimeter;
    }

}

class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(String color, boolean hasFill, double length, double width) {
        this.color = color;
        this.hasFill = hasFill;
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        double area = length * width;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

}

class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    Triangle(String color, boolean hasFill, double side1, double side2, double side3) {
        this.color = color;
        this.hasFill = hasFill;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }   

    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
}

public class Shapes {
   
}
