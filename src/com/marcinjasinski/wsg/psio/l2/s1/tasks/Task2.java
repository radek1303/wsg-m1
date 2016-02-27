package com.marcinjasinski.wsg.psio.l2.s1.tasks;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Class Task2
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task2 implements Serializable {

    /**
     * Program, który pobiera od użytkownika liczbę całkowitą dodatnią, a
     * następnie wyświetla na ekranie kolejno
     * wszystkie liczby niepatrzyste nie większe od podanej liczby. Przykład,
     * dla 15 program powinien
     * wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę = ");

        int x = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
