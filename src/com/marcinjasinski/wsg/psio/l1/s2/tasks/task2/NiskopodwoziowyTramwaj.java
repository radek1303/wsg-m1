package com.marcinjasinski.wsg.psio.l1.s2.tasks.task2;

import java.io.Serializable;

/**
 * Class NiskopodwoziowyTramwaj.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class NiskopodwoziowyTramwaj extends Tramwaj implements Serializable {

    public NiskopodwoziowyTramwaj(final String number, final Integer count) {
        super(number, count);
    }

    @Override
    public void go() {
        System.out.printf("Jestem niskopodwoziowym tramwajem o numerze %s, wiozę %d pasażerów\n",
                          getNumber(), getCount());
    }
}
