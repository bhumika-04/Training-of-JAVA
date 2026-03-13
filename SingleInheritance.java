// Single Inheritance — one class inherits from one parent class

class Animal {

    String name;
    String sound;

    void display() {
        System.out.println("Animal Name: " + name);
        System.out.println("Sound: " + sound);
    }
}

// Dog inherits from Animal
class Dog extends Animal {

    String breed;

    void show() {
        System.out.println("Breed: " + breed);
    }
}

class SingleInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Bruno";
        d.sound = "Woof";
        d.breed = "Labrador";

        d.display(); // from Animal
        d.show();    // from Dog
    }
}
