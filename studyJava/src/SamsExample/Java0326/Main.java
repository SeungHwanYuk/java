package SamsExample.Java0326;

import SamsExample.Java0326Example1.Circle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 10);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
