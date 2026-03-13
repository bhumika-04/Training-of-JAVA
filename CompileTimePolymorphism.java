// Compile Time Polymorphism — achieved through method overloading
// Compiler decides which method to call based on parameters

class Print {

    void print(int n) {
        System.out.println("Printing int: " + n);
    }

    void print(String s) {
        System.out.println("Printing String: " + s);
    }

    void print(double d) {
        System.out.println("Printing double: " + d);
    }
}

class CompileTimePolymorphism {

    public static void main(String[] args) {

        Print p = new Print();

        p.print(10);
        p.print("Hello Java");
        p.print(3.14);
    }
}
