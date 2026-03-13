// Encapsulation — wrapping data and methods together, private fields with public getters/setters

class Student {

    private String name;
    private int age;
    private double cgpa;

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Encapsulation {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Bhumika");
        s.setAge(21);
        s.setCgpa(8.5);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("CGPA: " + s.getCgpa());
    }
}
