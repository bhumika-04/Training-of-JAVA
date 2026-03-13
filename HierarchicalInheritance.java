// Hierarchical Inheritance — one parent, multiple child classes

class Shape {

    String color;

    void showColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {

    double radius;

    void area() {
        System.out.println("Circle area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    double length, width;

    void area() {
        System.out.println("Rectangle area: " + (length * width));
    }
}

class Triangle extends Shape {

    double base, height;

    void area() {
        System.out.println("Triangle area: " + (0.5 * base * height));
    }
}

class HierarchicalInheritance {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.color = "Red";
        c.radius = 7;
        c.showColor();
        c.area();

        Rectangle r = new Rectangle();
        r.color = "Blue";
        r.length = 5;
        r.width = 3;
        r.showColor();
        r.area();

        Triangle t = new Triangle();
        t.color = "Green";
        t.base = 6;
        t.height = 4;
        t.showColor();
        t.area();
    }
}
