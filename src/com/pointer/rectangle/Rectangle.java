package com.pointer.rectangle;

public class Rectangle {
    private double length;
    private double width;
    private double rectangleArea;
    private double rectanglePerimetr;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRectangleArea() {
        return rectangleArea;
    }

    public double getRectanglePerimetr() {
        return rectanglePerimetr;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }

    public void area() {
        rectangleArea = length * width;
        System.out.println("Площадь прямоугольника = " + rectangleArea);
    }

    public void perimetr() {
        rectanglePerimetr = (length + width) * 2;
        System.out.println("Периметр прямоугольника = " + rectanglePerimetr);
    }

}
