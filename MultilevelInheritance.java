// Multilevel Inheritance — chain of inheritance: A -> B -> C

class Vehicle {

    String brand;

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Car inherits Vehicle
class Car extends Vehicle {

    int doors;

    void showDoors() {
        System.out.println("Doors: " + doors);
    }
}

// ElectricCar inherits Car (which already has Vehicle)
class ElectricCar extends Car {

    int batteryRange;

    void showRange() {
        System.out.println("Battery Range: " + batteryRange + " km");
    }
}

class MultilevelInheritance {

    public static void main(String[] args) {

        ElectricCar ec = new ElectricCar();
        ec.brand = "Tesla";
        ec.doors = 4;
        ec.batteryRange = 500;

        ec.showBrand();  // from Vehicle
        ec.showDoors();  // from Car
        ec.showRange();  // from ElectricCar
    }
}
