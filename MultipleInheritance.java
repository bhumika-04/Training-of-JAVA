// Multiple Inheritance in Java
// Java does NOT allow a class to extend multiple classes
// But a class CAN implement multiple interfaces
// That is how multiple inheritance is achieved in Java

interface A {
    void methodA();
}

interface B {
    void methodB();
}

// Class C gets behaviour from both A and B
class C implements A, B {

    public void methodA() {
        System.out.println("Method from Interface A");
    }

    public void methodB() {
        System.out.println("Method from Interface B");
    }
}

class MultipleInheritance {

    public static void main(String[] args) {

        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
