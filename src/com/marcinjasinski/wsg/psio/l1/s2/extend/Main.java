package com.marcinjasinski.wsg.psio.l1.s2.extend;

import java.io.Serializable;

/**
 * Class Main.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Main implements Serializable {

    public static void main(String[] args) {

        Student student = new Student("Marcin", "Jasiński", "5327");

        student.student();
        System.out.println(student);
        System.out.println(student.me());

        Employer employer = new Employer("Test", "Test", "1234");

        System.out.println(employer);
        System.out.println(employer.me());

        Osoba o1 = new Student("M", "J", "1234");
        Osoba o2 = new Employer("MM", "JJ", "12345");

        if (o1 instanceof Student) {
            System.out.println("Jest Studentem!");
        } else {
            System.out.println("Nie jest Studentem!");
        }

        Main.who(student);
        Main.who(new Student2());

        if (student instanceof Studentable) {
            System.out.println("Jest Studentable!");
        } else {
            System.out.println("Nie jest Studentable!");
        }

        Main.hello(student, employer, new Driver("t", "t", "Audi RS6"));
    }

    public static void who(Studentable s) {
        s.makeExam();
    }

    public static void hello(Osoba... osoba) {
        for (Osoba o : osoba) {
            System.out.println(o.me());
        }
    }
}
