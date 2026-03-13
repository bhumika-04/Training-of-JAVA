// final keyword — three uses in Java

// 1. final class — cannot be extended
final class Constants {

    void show() {
        System.out.println("This is a final class");
    }
}

class MyClass {

    // 2. final variable — value cannot be changed
    final double PI = 3.14;

    // 3. final method — cannot be overridden in subclass
    final void display() {
        System.out.println("This is a final method");
        System.out.println("PI = " + PI);
    }
}

class FinalKeyword {

    public static void main(String[] args) {

        // using final variable
        MyClass obj = new MyClass();
        System.out.println("Value of PI: " + obj.PI);

        // calling final method
        obj.display();

        // using final class
        Constants c = new Constants();
        c.show();
    }
}
