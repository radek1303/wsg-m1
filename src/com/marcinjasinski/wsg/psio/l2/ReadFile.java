package com.marcinjasinski.wsg.psio.l2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class ReadFile
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class ReadFile implements Serializable {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("example.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        scanner = new Scanner(new File("example2.txt"));

        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.printf("max = %d, min = %d, sum = %d, avg = %4.2f", max, min, sum, avg);

        scanner.close();
    }
}
