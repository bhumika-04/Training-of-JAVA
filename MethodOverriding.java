// Method Overriding — child class provides its own version of a parent method

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog says: Woof");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

class MethodOverriding {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}
