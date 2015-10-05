package com.marcinjasinski.wsg.psio.l1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

/**
 * Class DataTypes
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class DataTypes implements Serializable {

    public static void main(String[] args) {

        // typy prymitywne
        byte b = 2; // 8 bitow
        //Byte
        short s = 12; // 16 bitow
        //Short
        int i = 123; // 32 bity
        //Integer
        long l = 12345l; // 64 bity
        //Long
        float f = 123f; // 32 bity
        //Float
        double d = 123d; // 64 bity
        //Double
        boolean bool = true;
        //Boolean
        //Void

        // deklaracja
        int c;
        // inicjalizacja
        c = 12;

        //\n znak konca linii
        System.out.format("%d %d %d %d\n", b, s, i, l);

        // typ referencyjny String
        String hello = "Hello";
        // nazewnictwo zmiennych - camelCase
        String myHello = hello + "!";

        System.out.println(myHello);

        // połączenie typow
        int value = 6;
        String stringValue = "value: " + value;

        System.out.println(stringValue);

        // typ wyliczeniowy
        Season season = Season.SPRING;

        System.out.println(season);

        // rzutowanie
        int a = (int) 10L;
        float ff = (float) 10.0;

        // stałe - wielkie litery
        final int SIZE = 5;

        // typ tablicowy
        int[] array = new int[SIZE];
        for (int x = 0; x < SIZE; x++) {
            array[x] = new Random().nextInt();
        }

        // tablica dwuwymiarowa
        int[][] array2 = new int[SIZE][SIZE];
        for (int i1 = 0; i1 < array2.length; i1++) {
            for (int i2 = 0; i2 < array2[i1].length; i2++) {
                array2[i1][i2] = new Random().nextInt();
            }
        }

        // inicjalizacja tabli
        String[] strings = {"a", "b", "c"};

        Arrays.stream(strings).forEach(System.out::println);

        System.out.println(Arrays.toString(array));

        // zakres zmiennych
        {
            int onlyInBlock = 2;
        }
        // zmienna j tylko w pętli
        for (int j = 0; j < 1; j++) {
            System.out.println(j);
        }

        /*
        domyślne wartości typów
        boolean - false
        byte, short, int, long, char, float, double - 0
        typy referencyjne - null
         */
    }

    enum Season {WINTER, SPRING, SUMMER, FALL}
}
