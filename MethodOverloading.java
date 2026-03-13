// Method Overloading — same method name, different parameters

class Calculator {

    // two integers
    int add(int a, int b) {
        return a + b;
    }

    // three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // two doubles
    double add(double a, double b) {
        return a + b;
    }
}

class MethodOverloading {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("add(3, 4) = " + calc.add(3, 4));
        System.out.println("add(1, 2, 3) = " + calc.add(1, 2, 3));
        System.out.println("add(2.5, 3.5) = " + calc.add(2.5, 3.5));
    }
}
