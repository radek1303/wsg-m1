package com.marcinjasinski.wsg.psio.l2.tasks;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Class Task5
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task5 implements Serializable {

    /**
     * Program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy
     * łańcuch będący odwróceniem podanego
     * łańcucha i wyświetla go na ekranie. Przykładowo, dla łańcucha „Kot”
     * wynikiem powinien być łańcuch „toK”.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków = ");

        String line = scanner.nextLine();

        scanner.close();

        String inverse = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            char charAt = line.charAt(i);
            inverse = inverse + charAt;
        }

        System.out.println(inverse);

        char[] strings = new char[line.length()];
        int count = 0;
        for (int i = line.length() - 1; i >= 0; i--) {
            strings[count++] = line.charAt(i);
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }

        System.out.println("");
    }
}
