package com.marcinjasinski.wsg.psio.l1.s2;

import java.io.Serializable;

/**
 * Class Test3.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Test3 implements Serializable {

    private int a;
    private int b;
    private int c;

    public Test3() {
        this(1, 1, 1);
        this.b = 7;
    }

    public Test3(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();

        System.out.println(test3);

        Test3 test4 = new Test3(2, 3, 4);

        System.out.println(test4);
    }

    @Override
    public String toString() {
        return "com.marcinjasinski.wsg.psio.l1.s2.Test3{" +
               "a=" + a +
               ", b=" + b +
               ", c=" + c +
               '}';
    }
}
