# Training of Java — OOP Concepts & Servlets ☕

This repo is from my training period where I learned Object Oriented Programming in Java and got a basic intro to Java Servlets.

The OOP part covers all major concepts with working code examples. The servlet part is very basic — just login and form handling.

---

## OOP Concepts

| File | Topic |
|------|-------|
| `Encapsulation.java` | Private fields with public getters and setters |
| `Abstraction.java` | Abstract class Shape with Circle and Rectangle |
| `AbstractClass.java` | Abstract class Animal with Dog and Cat |
| `Interface.java` | Implementing multiple interfaces (Printable, Showable) |
| `MultipleInheritance.java` | Multiple inheritance via interfaces |
| `SingleInheritance.java` | One class inheriting from one parent |
| `MultilevelInheritance.java` | Vehicle → Car → ElectricCar |
| `HierarchicalInheritance.java` | One base class, multiple child classes |
| `HybridInheritance.java` | Class + interfaces combined |
| `MethodOverriding.java` | Child class overrides parent method |
| `MethodOverloading.java` | Same method name, different parameters |
| `RuntimePolymorphism.java` | Parent reference holds child object — resolved at runtime |
| `CompileTimePolymorphism.java` | Method overloading — resolved at compile time |
| `SuperKeyword.java` | super() constructor and super.method() usage |
| `FinalKeyword.java` | final variable, final method, final class |
| `StaticKeyword.java` | Static variable and static method |
| `ThisKeyword.java` | this keyword and constructor chaining |
| `Constructor.java` | Default, parameterized, and copy constructors |
| `ExceptionHandling.java` | try-catch-finally and custom exception |
| `Packages.java` | Java packages concept with ArrayList and Scanner |

---

## Servlets

| File | Topic |
|------|-------|
| `LoginServlet.java` + `login.html` | Login form handling |
| `FormServlet.java` + `form.html` | Form submission and display |

---

## Concepts Covered

- Encapsulation, Abstraction
- Interfaces and Abstract Classes
- All types of Inheritance (Single, Multilevel, Hierarchical, Multiple, Hybrid)
- Method Overloading and Overriding
- Runtime and Compile Time Polymorphism
- super, this, final, static keywords
- Constructors (Default, Parameterized, Copy)
- Exception Handling and Custom Exceptions
- Java Packages
- Java Servlets (basic)

---

## Note on Servlets

Servlets need a web server like Apache Tomcat to run. These were my first experiments with server-side Java during training. The servlet files use `javax.servlet` which comes with Tomcat — they won't compile without it in the classpath.

---

## Language
Java | Training Period | BTech CSE
