package com.marcinjasinski.wsg.psio.l2.s1.tasks;

import java.io.Serializable;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Class Task7
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task7 implements Serializable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita = ");
        int value = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                System.out.println(i);
            }
        }

        IntStream.iterate(1, i -> i + 1).limit(value).filter(i -> value % i == 0).forEach(System.out::println);
    }
}
