package HW23GroupProgect2;


    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
    */


public class Task06Shape {
    double calculateArea() {
        return 0;
    }

    double calculatePerimeter() {
        return 0;
    }
}

class Circle extends Task06Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Task06Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class ShapeTester {
    public static void main(String[] args) {
        Task06Shape circle = new Circle(4);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Task06Shape square = new Square(7);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}
