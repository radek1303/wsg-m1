package com.marcinjasinski.wsg.psio.l1.s2.extend;

/**
 * Interface Studentable.
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public interface Studentable extends TestStudent {

    void makeExam();
}

interface TestStudent {

    void testStudent();
}