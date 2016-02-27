package com.marcinjasinski.wsg.psio.l2;

import java.io.Serializable;

/**
 * Class Recursion
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Recursion implements Serializable {

    public static final int MAX = 2;

    public static int sumIteration(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }

    public static int sumRecursion(int n) {
        if (n > 0) {
            return n + sumRecursion(n - 1);
        }
        return 0;
    }

    public static void main(String[] args) {

        int iterationSum = Recursion.sumIteration(MAX);
        int recursionSum = Recursion.sumRecursion(MAX);

        System.out.println("sum for iteration: " + iterationSum);
        System.out.println("sum for recursion: " + recursionSum);
    }
}
