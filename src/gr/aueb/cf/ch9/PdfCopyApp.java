package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ανατιγραφει ενα pdf αρχειο (ως binary file)
 */

public class PdfCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;

        try (FileInputStream fis = new FileInputStream("C:/Users/xrist/OneDrive/Desktop/javatest/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/Users/xrist/OneDrive/Desktop/javatest/dummy-out.pdf")) {

            start = System.currentTimeMillis();


            while ((b = fis.read()) != -1) {
                fos.write(b);
                counter++;
            }

            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("Το αρχειο με μεγεθος %.1fKB (%d bytes) αντιγραφηκε επιτυχως",(counter/ 1024.0) , counter);
            System.out.println("Elapsed time :" + elapsedTime + " seconds");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
