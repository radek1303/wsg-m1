package com.marcinjasinski.wsg.psio.l1.s2.tasks.task2;

import java.io.Serializable;

/**
 * Class Main.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Main implements Serializable {

    public static void main(String[] args) {

        Autobus autobus = new Autobus("1", 12);
        PrzegubowyAutobus przegubowyAutobus = new PrzegubowyAutobus("2", 24);
        Tramwaj tramwaj = new Tramwaj("11", 23);
        NiskopodwoziowyTramwaj niskopodwoziowyTramwaj = new NiskopodwoziowyTramwaj("12", 25);

        Main.go(autobus, przegubowyAutobus, tramwaj, niskopodwoziowyTramwaj);
    }

    public static void go(Pojazd... pojazdy) {
        for (Pojazd p : pojazdy) {
            p.go();
        }
    }
}
