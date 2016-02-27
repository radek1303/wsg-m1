package com.marcinjasinski.wsg.psio.l2.tasks;

import java.io.Serializable;
import java.util.Random;

/**
 * Class Task8.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task8 implements Serializable {

    public static void main(String[] args) {
        final int ROWS = 5;
        final int COLS = 5;

        int[][] tab = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                tab[i][j] = new Random().nextInt(7) + 1;
            }
        }

        for (int i = 0; i < ROWS; i++) {
            System.out.println();
            for (int j = 0; j < COLS; j++) {
                System.out.print(tab[i][j] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < COLS; i++) {
            int maxWKolumnie = tab[0][i], minWKolumnie = tab[0][i];

            for (int j = 0; j < ROWS; j++) {
                if (tab[j][i] > maxWKolumnie) {
                    maxWKolumnie = tab[j][i];
                }

                if (tab[j][i] < minWKolumnie) {
                    minWKolumnie = tab[j][i];
                }
            }

            System.out.println("maxWKolumnie " + (i + 1) + ": " + maxWKolumnie);
            System.out.println("minWKolumnie " + (i + 1) + ": " + minWKolumnie);
            System.out.println();
        }

        for (int i = 0; i < ROWS; i++) {
            int maxWWierszu = tab[i][0], minWWierszu = tab[i][0];

            for (int j = 0; j < COLS; j++) {
                if (tab[i][j] < minWWierszu) {
                    minWWierszu = tab[i][j];
                }

                if (tab[i][j] > maxWWierszu) {
                    maxWWierszu = tab[i][j];
                }
            }
            System.out.println("minWWierszu " + (i + 1) + ": " + minWWierszu);
            System.out.println("maxWWierszu " + (i + 1) + ": " + maxWWierszu);
            System.out.println();
        }
    }
}
