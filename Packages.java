// Packages — used to group related classes together
// They avoid naming conflicts and make code organized
//
// To create a package: put "package mypackage;" at top of file
// To use a class from another package: import packagename.ClassName;
//
// Java has built-in packages like:
//   java.util  — utility classes (Scanner, ArrayList, etc.)
//   java.io    — input/output
//   java.lang  — basic classes (auto-imported, no need to write import)

import java.util.ArrayList;
import java.util.Scanner;

class Packages {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> subjects = new ArrayList<String>();

        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("OS");
        subjects.add("CN");

        System.out.println("Subjects list:");
        for (String s : subjects) {
            System.out.println(s);
        }

        System.out.println("Total subjects: " + subjects.size());

        sc.close();
    }
}
