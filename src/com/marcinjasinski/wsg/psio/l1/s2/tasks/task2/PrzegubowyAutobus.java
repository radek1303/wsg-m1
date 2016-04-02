package com.marcinjasinski.wsg.psio.l1.s2.tasks.task2;

import java.io.Serializable;

/**
 * Class PrzegubowyAutobus.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class PrzegubowyAutobus extends Autobus implements Serializable {

    public PrzegubowyAutobus(final String number, final Integer count) {
        super(number, count);
    }

    @Override
    public void go() {
        System.out.printf("Jestem przegubowym autobusem o numerze %s, wiozę %d pasażerów\n",
                          getNumber(), getCount());
    }
}
