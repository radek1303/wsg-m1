package com.marcinjasinski.wsg.psio.l2.tasks;

import java.io.Serializable;

/**
 * Class Task1
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task1 implements Serializable {

    /**
     * Program do konwersji wartości temperatury podanej w stopniach Celsjusza
     * na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
     *
     * @param args
     */
    public static void main(String[] args) {

        double in = 10;

        double out = 1.8 * in + 32.0;

        System.out.println(out);
    }
}
