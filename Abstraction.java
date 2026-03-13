// Abstraction — hiding implementation details, showing only what is necessary
// Abstract class cannot be instantiated directly

abstract class Shape {

    // abstract method — no body, subclass must implement
    abstract void area();
}

class Circle extends Shape {

    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Circle area: " + a);
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        double a = length * width;
        System.out.println("Rectangle area: " + a);
    }
}

class Abstraction {

    public static void main(String[] args) {

        Shape c = new Circle(5);
        c.area();

        Shape r = new Rectangle(4, 6);
        r.area();
    }
}
