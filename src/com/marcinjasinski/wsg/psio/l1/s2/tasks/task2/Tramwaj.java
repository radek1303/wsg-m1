package com.marcinjasinski.wsg.psio.l1.s2.tasks.task2;

import java.io.Serializable;

/**
 * Class Tramwaj.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Tramwaj extends Pojazd implements Serializable {

    public Tramwaj(final String number, final Integer count) {
        super(number, count);
    }

    @Override
    public void go() {
        System.out.printf("Jestem tramwajem o numerze %s, wiozę %d pasażerów\n", getNumber(),
                          getCount());
    }
}
