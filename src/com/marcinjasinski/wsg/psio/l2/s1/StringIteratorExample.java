package com.marcinjasinski.wsg.psio.l2.s1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Class StringIteratorExample
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class StringIteratorExample {

    public static final String FILE_NAME = "example.txt";

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
        StringIterator stringIterator = new StringIterator(bufferedReader);

        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            System.out.println(next);
        }

        System.out.println();

        bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
        StringIterator2 stringIterator2 = new StringIterator2(bufferedReader);
        while (stringIterator2.iterator().hasNext()) {
            String next = stringIterator2.iterator().next();
            System.out.println(next);
        }
    }
}

class StringIterator implements Iterator<String> {

    private final BufferedReader bufferedReader;
    private String line;

    public StringIterator(final BufferedReader bufferedReader) throws IOException {
        this.bufferedReader = bufferedReader;
        this.line = this.bufferedReader.readLine();
    }

    @Override
    public boolean hasNext() {
        return this.line != null;
    }

    @Override
    public String next() {

        String next = this.line;

        try {
            this.line = this.bufferedReader.readLine();
            if (this.line == null) {
                this.bufferedReader.close();
            }
        } catch (IOException ignored) {
        }

        return next;
    }
}

class StringIterator2 implements Iterable<String> {

    private final BufferedReader bufferedReader;
    private String line;

    public StringIterator2(final BufferedReader bufferedReader) throws IOException {
        this.bufferedReader = bufferedReader;
        this.line = this.bufferedReader.readLine();
    }

    @Override
    public java.util.Iterator<String> iterator() {
        return new Iterator();
    }

    public class Iterator implements java.util.Iterator<String> {

        @Override
        public boolean hasNext() {
            return line != null;
        }

        @Override
        public String next() {

            String next = line;

            try {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                }
            } catch (IOException ignored) {
            }

            return next;
        }
    }
}
