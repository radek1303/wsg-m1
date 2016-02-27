package com.marcinjasinski.wsg.psio.l2.s1.tasks;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Class Task3
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task3 implements Serializable {

    /**
     * Program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki
     * nie podana zostanie liczba 0.
     * Następnie wyświetlić sumę wszystkich podanych liczb.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nextInt, sum = 0;
        do {

            System.out.println("Podaj liczbę = ");
            nextInt = scanner.nextInt();

            sum += nextInt;

        } while (nextInt != 0);

        scanner.close();

        System.out.println(sum);
    }
}
