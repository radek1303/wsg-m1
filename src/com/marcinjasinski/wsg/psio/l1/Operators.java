package com.marcinjasinski.wsg.psio.l1;

import java.io.Serializable;

/**
 * Class Operators
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Operators implements Serializable {

    public static void main(String[] args) {

        // operatory
        int a = 2 + 2;
        int b = 2 - 5;

        // a = a + 4
        a += 4;

        System.out.format("%d %d\n", a, b);

        // pre/post-inkremetacja
        int i = 1;
        int ii = i++;
        int iii = ++i;

        System.out.format("%d %d %d\n", i, ii, iii);

        // pre/post-dekrementacja
        int j = 1;
        int jj = j--;
        int jjj = --j;

        System.out.format("%d %d %d\n", j, jj, jjj);

        // modulo
        int c = a % 3;
        System.out.println(c);

        // porównania
        boolean eqals = a == b;
        // >= <= !=
        // negacja
        boolean bb = !eqals;
        System.out.println(bb);

        //operatory logiczne: !
        boolean bbb = bb && eqals;

        System.out.println(bbb);

        bbb = bb || eqals;

        System.out.println(bbb);

        // operatory binarne: and - &, or - |, xor - ^
        int binary = 123;
        int binary2 = binary & 12;

        System.out.println(binary2);

        // operacje binarne: << >> >>> ~ - negacja logiczna
        int bb1 = 4 << 2;

        System.out.println(bb1);
    }
}
