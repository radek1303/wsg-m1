package com.marcinjasinski.wsg.psio.l1.s2.tasks;

import java.io.Serializable;

/**
 * Class Pozycja.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Pozycja implements Serializable {

    private static final long serialVersionUID = -2081662915954457110L;
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja(final String nazwaTowaru, final int ileSztuk, final double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return String.
                format("%-20s %10.2f zł %4d szt. %10.2f zł", nazwaTowaru, cena, ileSztuk,
                       obliczWartosc());
    }

    public double obliczWartosc() {
        return ileSztuk * cena;
    }
}
