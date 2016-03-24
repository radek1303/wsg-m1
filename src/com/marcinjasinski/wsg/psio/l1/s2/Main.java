package com.marcinjasinski.wsg.psio.l1.s2;

import java.io.Serializable;

/**
 * Class Main.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Main implements Serializable {

    private static final long serialVersionUID = 6057451236661269110L;

    public static void main(String[] args) {
        final Test test = new Test(2, 3, 2);

        System.out.println(test);

        test.e = 4;
        test.f = 12;

        System.out.println(test);

        final Test test1 = new Test();

        System.out.println(test1);

        final Test test2 = new Test(3, 4);

        System.out.println(test2);

        final Test test3 = new Test();

        System.out.println(test3);

        test3.setC(11);

        System.out.println(test3);

        double sum = test3.sum();

        System.out.println(sum);

        test3.setSum(11);

        System.out.println(test3.getSum());

        //        while (true) {
        //            Test test4 = new Test(1, 2, 3);
        //            test4 = null;
        //
        //            System.gc();
        //        }
    }
}
