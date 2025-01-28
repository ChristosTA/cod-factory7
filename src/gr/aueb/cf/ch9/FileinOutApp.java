package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileinOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:/Users/xrist/OneDrive/Desktop/javatest/file7.txt");
        String line;
        String[] tokens;
        File outFd = new File("C:/Users/xrist/OneDrive/Desktop/javatest/file7-out.txt");


        try (Scanner in = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)){
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token + " ");
                    ps.printf("%s ",token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e ){
            e.printStackTrace();

        }
    }
}
