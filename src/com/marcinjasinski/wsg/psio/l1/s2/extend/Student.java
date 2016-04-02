package com.marcinjasinski.wsg.psio.l1.s2.extend;

/**
 * Class Student.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Student extends Osoba implements Studentable {

    private String albumNumber;

    public Student(final String name, final String surname, final String albumNumber) {
        super(name, surname);
        this.albumNumber = albumNumber;
    }

    @Override
    public String me() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student{" +
               "albumNumber='" + albumNumber + '\'' +
               "} " + super.toString();
    }

    void student() {
    }

    @Override
    public void makeExam() {
        System.out.println("Make exam!");
    }

    @Override
    public void testStudent() {

    }
}
