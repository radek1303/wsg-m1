package com.marcinjasinski.wsg.psio.l1;

import java.io.Serializable;

/**
 * Class Instructions
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Instructions implements Serializable {

    public static void main(String[] args) {

        /*
        instrukcja warunkowa

        if(warunek) {
            true
        } else {
            false
        }

        można łatwo zamienić na switch

         */
        String command = "Cancel";
        if (command.equals("OK")) {
            System.out.println("OK");
        } else if (command.equals("Cancel")) {
            System.out.println("Cancel");
        } else if (command.equals("Add")) {
            System.out.println("Add");
        } else {
            System.out.println("else");
        }

        System.out.println();

        /*
        operator ?:
         */
        System.out.println(true ? "True" : "False");

        /*
        pętal for
        for (poczatek; warunek_logiczny; wyrazenie_petli) {
            // blok operacji
        }
         */
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 5;
        }

        /*
        pętla foreach
        for(Object o: Collection<Object>) {
            blok operacji
        }
         */
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println();

        /*
        pętla while
        while(warunek) {
            blok operacji
        }
         */
        int w = 3;
        while (w != 0) {
            System.out.println(w--);
        }

        System.out.println();

        /*
        pętla do {
            blok operacji
        } while(warunek)
         */
        int d = 3;
        do {
            System.out.println(d++);
        } while (d < 10);

        System.out.println();

        // instrukcje break and continue
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println("break");
                break;
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        // instrukcja switch - musi być break, aby zakończyć sterowanie
        int sw = 2;

        switch (sw) {
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }
    }
}
