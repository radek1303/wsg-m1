package com.marcinjasinski.wsg.psio.l1;

import java.io.Serializable;

/**
 * Class Arguments
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Arguments implements Serializable {

    public static void changeVal(int val) {
        System.out.println("Wartość typu int.");

    }

    public static void changeVal(String val) {
        System.out.println("Wartość typu String.");

    }

    public static void changeVal(long val) {
        System.out.println("Wartość typu long.");
    }

    public static void manyParameters(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        // metoda może się tak samo nazywać, ale musi posiadać różny zestaw parametrów
        Arguments.changeVal(12);
        Arguments.changeVal("12");
        Arguments.changeVal(12L);
        Arguments.manyParameters("one", "two");
    }
}
