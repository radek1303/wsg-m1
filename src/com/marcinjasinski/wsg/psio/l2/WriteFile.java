package com.marcinjasinski.wsg.psio.l2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * Class WriteFile
 *
 * @author Marcin Jasiński {@literal <mkjasinski@gmail.com>}
 */
public class WriteFile implements Serializable {

    public static void main(String[] args) {

        FileOutputStream fop = null;
        File file;
        String content = "This is the text content";

        try {

            file = new File("example3.txt");
            fop = new FileOutputStream(file);

            if (!file.exists()) {
                boolean isCreated = file.createNewFile();
                System.out.printf("file created: %b", isCreated);
            }

            byte[] contentInBytes = content.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Plik zapisany poprawnie.");

        } catch (IOException ignored) {
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException ignored) {
            }
        }
    }
}
