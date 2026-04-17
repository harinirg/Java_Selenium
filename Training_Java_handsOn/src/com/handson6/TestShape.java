package com.handson6;

import java.util.Scanner;
abstract class Shape {

    protected String color = "red";
    protected boolean filled = true;

    Shape() {}

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
class Circle extends Shape {

    private double radius = 1.0;

    Circle() {}

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

    Rectangle() {}

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return width * length;
    }

    double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[" + super.toString() +
               ", width=" + width + ", length=" + length + "]";
    }
}
class Square extends Rectangle {

    Square() {}

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

public class TestShape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Circle Radius:");
        double radius = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Circle Color:");
        String color = sc.nextLine();
        System.out.println("Is Circle Filled? (true/false)");
        boolean filled = sc.nextBoolean();

        Circle c = new Circle(radius, color, filled);

        System.out.println(c);
        System.out.println("Area = " + c.getArea());
        System.out.println("Perimeter = " + c.getPerimeter());

        System.out.println("Enter Rectangle Width:");
        double width = sc.nextDouble();
        System.out.println("Enter Rectangle Length:");
        double length = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Rectangle Color:");
        String rcolor = sc.nextLine();
        System.out.println("Is Rectangle Filled? (true/false)");
        boolean rfilled = sc.nextBoolean();

        Rectangle r = new Rectangle(width, length, rcolor, rfilled);

        System.out.println(r);
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());

        System.out.println("Enter Square Side:");
        double side = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Square Color:");
        String scolor = sc.nextLine();
        System.out.println("Is Square Filled? (true/false)");
        boolean sfilled = sc.nextBoolean();

        Square s = new Square(side, scolor, sfilled);

        System.out.println(s);
        System.out.println("Area = " + s.getArea());
        System.out.println("Perimeter = " + s.getPerimeter());

        sc.close();
    }
}
