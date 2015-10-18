package com.marcinjasinski.wsg.psio.l1;

/**
 * Class Task1
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task1 {

    public static void main(String[] args) {

        double a = 5.2;
        double b = 3.4;

        double sum = a + b;
        double sub = a - b;
        double il = a * b;
        double ilo = a / b;

        System.out.println("suma: " + sum);
        System.out.printf("różnica: %4.2f\n", sub);
        System.out.println("iloczyn: " + il);
        System.out.printf("iloraz: %4.2f\n", ilo);

        int aa = (int) a;
        int bb = (int) b;

        System.out.println("aa = " + aa + ", bb = " + bb);

        int aaa = aa % 2;
        System.out.println(aaa);

        int bbb = bb % 2;
        System.out.println(bbb);
    }
}
