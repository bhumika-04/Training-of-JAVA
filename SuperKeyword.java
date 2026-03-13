// super keyword — used to access parent class members and constructor

class Parent {

    String name;

    Parent(String name) {
        this.name = name;
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Parent name: " + name);
    }
}

class Child extends Parent {

    int age;

    Child(String name, int age) {
        super(name); // calling parent constructor
        this.age = age;
        System.out.println("Child constructor called");
    }

    void display() {
        super.display(); // calling parent method
        System.out.println("Child age: " + age);
    }
}

class SuperKeyword {

    public static void main(String[] args) {

        Child c = new Child("Bhumika", 21);
        c.display();
    }
}
