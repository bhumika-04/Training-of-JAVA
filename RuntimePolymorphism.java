// Runtime Polymorphism — method call is resolved at runtime
// Parent reference holds child object (upcasting)

class Animal {

    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {

    @Override
    void speak() {
        System.out.println("Cow moos");
    }
}

class RuntimePolymorphism {

    public static void main(String[] args) {

        // parent reference, child object — upcasting
        Animal a;

        a = new Dog();
        a.speak(); // calls Dog's speak at runtime

        a = new Cat();
        a.speak(); // calls Cat's speak at runtime

        a = new Cow();
        a.speak(); // calls Cow's speak at runtime
    }
}
