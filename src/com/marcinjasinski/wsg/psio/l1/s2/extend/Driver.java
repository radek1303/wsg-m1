package com.marcinjasinski.wsg.psio.l1.s2.extend;

/**
 * Class Driver.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Driver extends Osoba {

    private String car;

    public Driver(final String name, final String surname, final String car) {
        super(name, surname);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    @Override
    public String me() {
        return "Driver";
    }
}
