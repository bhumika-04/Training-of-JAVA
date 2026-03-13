// Abstract Class — can have both abstract methods and regular methods

abstract class Animal {

    // abstract method — subclass must override this
    abstract void sound();

    // regular method — available to all subclasses
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog says: Woof");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat says: Meow");
    }
}

class AbstractClass {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.eat();

        Cat c = new Cat();
        c.sound();
        c.eat();
    }
}
