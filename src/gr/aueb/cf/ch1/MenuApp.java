package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 επιλεξει ο χρηστης μια απο της επιλογες και εμφανιζει την επιλογη του
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int num1;


        System.out.printf("Επιλεξτε μια απο τις παρακατω επιλογες :%n1.Εισαγωγη%n 2.Διαγραφη%n 3.Αναζητηση%n " +
                "4.Ενημερωση%n 5.Εξοδος%n Δωστε αριθμο επιλογης");
        num1 = in.nextInt();

        System.out.println("επελεξες το " + num1 );
    }
}
