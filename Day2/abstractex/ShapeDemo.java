package abstractex;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.calculateArea();
        s2.calculateArea();
    }
}
