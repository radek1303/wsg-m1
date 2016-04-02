package com.marcinjasinski.wsg.psio.l1.s2.extend;

import java.io.Serializable;

/**
 * Class Osoba.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public abstract class Osoba implements Serializable {

    private String name;
    private String surname;

    public Osoba(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String me();

    @Override
    public String toString() {
        return "Osoba{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               '}';
    }
}
