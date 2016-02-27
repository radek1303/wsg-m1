package com.marcinjasinski.wsg.psio.l2.s1.tasks;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Class Task6
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class Task6 implements Serializable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę = ");
        double left = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Podaj znak = ");
        String operation = scanner.nextLine();

        System.out.println("Podaj liczbę = ");
        double right = scanner.nextDouble();

        scanner.close();

        double result = 0;
        boolean badOperation = false;
        switch (operation) {
            case "+":
                result = left + right;
                break;
            case "-":
                result = left - right;
                break;
            case "*":
                result = left * right;
                break;
            case "/":
                if (right != 0) {
                    result = left / right;
                }
                break;
            default:
                badOperation = true;
        }

        if (badOperation) {
            System.out.printf("Błędna operacja!");
            System.exit(1);
        }

        if (right == 0) {
            System.out.printf("Nie można wykonac dzielenia przez 0!");
            System.exit(1);
        }

        System.out.printf("%5.2f %s %5.2f = %5.2f", left, operation, right, result);
    }
}
