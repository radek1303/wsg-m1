package com.marcinjasinski.wsg.psio.l2.s1;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Class ReadString
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class ReadString implements Serializable {

    public static void main(String[] args) {

        String input = "1,2,3,test,5,6,admin,8,9,example";
        Scanner s = new Scanner(input).useDelimiter(",");

        while (s.hasNext()) {
            System.out.println(s.next());
        }

        s.close();
    }
}
