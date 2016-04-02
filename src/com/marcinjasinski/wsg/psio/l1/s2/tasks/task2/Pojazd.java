package com.marcinjasinski.wsg.psio.l1.s2.tasks.task2;

import java.io.Serializable;

/**
 * Class Pojazd.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public abstract class Pojazd implements Serializable {

    private String number;
    private Integer count;

    public Pojazd(final String number, final Integer count) {
        this.number = number;
        this.count = count;
    }

    public abstract void go();

    public String getNumber() {
        return number;
    }

    public Integer getCount() {
        return count;
    }
}
