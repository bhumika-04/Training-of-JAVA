// this keyword — refers to the current object

class Student {

    String name;
    int age;

    // this() — constructor chaining, calls another constructor
    Student() {
        this("Unknown", 0); // calls parameterized constructor
        System.out.println("Default constructor called");
    }

    Student(String name, int age) {
        // this.name refers to the field, name is the parameter
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class ThisKeyword {

    public static void main(String[] args) {

        Student s1 = new Student("Bhumika", 21);
        s1.display();

        System.out.println();

        Student s2 = new Student(); // uses default, chains to parameterized
        s2.display();
    }
}
