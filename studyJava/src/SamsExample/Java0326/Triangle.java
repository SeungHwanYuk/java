package SamsExample.Java0326;

public class Triangle implements Shape {
   /* public double upperlength;*/
    public double base;
    public double height;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (height * base) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return base * 3;
    }
}
