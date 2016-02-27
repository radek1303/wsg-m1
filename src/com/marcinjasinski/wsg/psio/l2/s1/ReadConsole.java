package com.marcinjasinski.wsg.psio.l2.s1;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Class ReadConsole
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class ReadConsole implements Serializable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ciag znaków = ");

        String line = scanner.nextLine();

        System.out.printf("\n%s\n", line);

        System.out.print("Podaj liczbe calkowita = ");

        int i = scanner.nextInt();

        System.out.printf("\n%d\n", i);

        System.out.print("Podaj liczbę rzeczywistą = ");

        double d = scanner.nextDouble();

        System.out.printf("\n%4.2f\n", d);

        scanner.close();
    }
}
