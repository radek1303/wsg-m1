package com.marcinjasinski.wsg.psio.l1.s2.tasks;

import java.io.Serializable;

/**
 * Class Task1.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task1 implements Serializable {

    private static final long serialVersionUID = -4090574913563863932L;

    public static void main(String[] args) {
        Pozycja pozycja = new Pozycja("Cytryny", 10, 23.4);

        System.out.println(pozycja);
    }
}
