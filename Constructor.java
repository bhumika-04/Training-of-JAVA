// Constructor — special method called when object is created
// Types: Default, Parameterized, Copy

class Box {

    double length, width, height;

    // Default constructor
    Box() {
        length = 1;
        width = 1;
        height = 1;
        System.out.println("Default constructor");
    }

    // Parameterized constructor
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        System.out.println("Parameterized constructor");
    }

    // Copy constructor — takes another Box as parameter
    Box(Box b) {
        length = b.length;
        width = b.width;
        height = b.height;
        System.out.println("Copy constructor");
    }

    void show() {
        System.out.println("Box: " + length + " x " + width + " x " + height);
    }
}

class Constructor {

    public static void main(String[] args) {

        Box b1 = new Box();         // default
        b1.show();

        Box b2 = new Box(5, 3, 2);  // parameterized
        b2.show();

        Box b3 = new Box(b2);       // copy of b2
        b3.show();
    }
}
