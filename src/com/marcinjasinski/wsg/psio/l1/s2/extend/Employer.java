package com.marcinjasinski.wsg.psio.l1.s2.extend;

/**
 * Class Employer.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Employer extends Osoba {

    private String identity;

    public Employer(final String name, final String surname, final String identity) {
        super(name, surname);
        this.identity = identity;
    }

    @Override
    public String me() {
        return "Employer";
    }

    @Override
    public String toString() {
        return "Employer{" +
               "identity='" + identity + '\'' +
               "} " + super.toString();
    }
}
