package com.marcinjasinski.wsg.psio.l1.s2;

import java.io.Serializable;

/**
 * Class Test2.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Test2 implements Serializable {

    public final static String b = "b";
    public static String a;
    public static String aa;

    static {
        a = "a";
        aa = "aa";

        System.out.println("Blok statyczny");
    }

    {
        System.out.println("Blok inicjalizujący");
    }

    public Test2() {
        System.out.println("Konstruktor");
    }

    public static void main(String[] args) {

        //        final Test2 t2 = new Test2();
        //
        //        System.out.println(Test2.a);
        //
        //        Test2.a = "b";
        //
        //        System.out.println(Test2.a);
        //
        //        System.out.println(Test2.b);
        System.out.println(Test2.a);
        System.out.println(Test2.aa);
        System.out.println(Test2.b);
    }
}
