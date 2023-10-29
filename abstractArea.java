abstract class Shape {

    abstract double calculateArea();
}


class Rectangle extends Shape {
    private double height,width;

    // Constructor
    public Rectangle(double width,double height) {
        this.width = width;
        this.height=height;
    }


    double calculateArea() {
        return Math.PI * width * height;
    }
}


class Square extends Shape {
    private double side;


    public Square(double side) {
        this.side = side;
    }


    double calculateArea() {
        return side * side;
    }
}


class Triangle extends Shape {
    private double base;
    private double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class abstractArea {
    public static void main(String[] args) {
        // Create instances of different shapes
        Rectangle rectangle = new Rectangle(5.0,6.0);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(6.0, 8.0);

        // Calculate and print the areas
        System.out.println("Area of Ractangle: " + rectangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}