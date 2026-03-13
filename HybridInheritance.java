// Hybrid Inheritance — combination of multiple inheritance types
// In Java, done using class + interfaces together

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Animal {

    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Duck extends Animal AND implements Flyable and Swimmable
class Duck extends Animal implements Flyable, Swimmable {

    public void fly() {
        System.out.println(name + " is flying");
    }

    public void swim() {
        System.out.println(name + " is swimming");
    }
}

class HybridInheritance {

    public static void main(String[] args) {

        Duck d = new Duck();
        d.name = "Donald";

        d.eat();   // from Animal
        d.fly();   // from Flyable
        d.swim();  // from Swimmable
    }
}
