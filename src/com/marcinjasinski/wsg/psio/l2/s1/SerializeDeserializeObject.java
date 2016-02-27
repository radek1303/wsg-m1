package com.marcinjasinski.wsg.psio.l2.s1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Class SerializeDeserializeObject
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class SerializeDeserializeObject implements Serializable {

    public static void main(String[] args) {

        Person person = new Person("Marcin", "Jasiński");

        System.out.println(person);

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);

            objectOutputStream.close();

            fileOutputStream.close();

            System.out.println("Dane zserializowane!");

        } catch (IOException ignored) {
        }

        Person personAfter = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("person.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            personAfter = (Person) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException ignored) {
        }

        System.out.println(personAfter);
    }
}

class Person implements Serializable {

    private static final long serialVersionUID = 2099721685478534187L;

    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}