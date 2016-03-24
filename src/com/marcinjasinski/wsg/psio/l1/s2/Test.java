package com.marcinjasinski.wsg.psio.l1.s2;

import java.io.Serializable;

/**
 * Class Test.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Test implements Serializable {

    private static final long serialVersionUID = 7037566104603337389L;
    public int e;
    protected int g;
    int f;
    private int a;
    private int b;
    private double c;
    private float d;
    private double sum;

    {
        d = 10;
    }

    public Test() {
    }

    public Test(final int b, final double c) {
        this(1, b, c);
    }

    public Test(final int a, final int b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double sum() {
        sum = a + b + c + d;
        return sum;
    }

    @Override
    public String toString() {
        return "{" +
               "a=" + a +
               ", b=" + b +
               ", c=" + c +
               ", d=" + d +
               ", sum=" + sum +
               ", e=" + e +
               ", f=" + f +
               ", g=" + g +
               '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Usuwam obiekt!");
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setC(final double c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(final double sum) {
        this.sum = sum;
    }

    public int getE() {
        return e;
    }

    public int getG() {
        return g;
    }

    public int getF() {
        return f;
    }
}
