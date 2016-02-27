package com.marcinjasinski.wsg.psio.l2.tasks;

import java.io.Serializable;
import java.util.Random;

/**
 * Class Task4
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task4 implements Serializable {

    public static final int BOUND = 10;

    /**
     * Program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
     * a następnie wypisze na ekranie ile
     * razy każda z liczb z tego przedziału powtarza się w tablicy.
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();

        int[] tab = new int[BOUND * 2];
        for (int i = 0; i < BOUND; i++) {
            int nextInt = random.nextInt(BOUND) + 1;
            tab[i] = nextInt;
            System.out.println(nextInt);
        }

        int[] tab1 = new int[10];
        for (int i = 1; i <= BOUND; i++) {
            tab1[tab[i - 1] - 1]++;
        }

        System.out.println("-----------------");

        for (int aTab1 : tab1) {
            System.out.println(aTab1);
        }
    }
}
