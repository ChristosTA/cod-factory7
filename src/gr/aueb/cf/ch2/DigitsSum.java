package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβανει ως input απο τον Χρηστη ενα
 * διψηιο ακεραιο και να υπολογιζει και να εκτυπωνη το αθροισμα των ψηφιων του.
 * Για παραδειγμα αν χρηστης δωσει τον ακεραιο , θα πρεπει το αποτελεσμα να ειναι
 * 1 + 5 = 6
 */
public class DigitsSum {

    public static void main(String[] args) {
        int digitsSum = 0;
        int prwtos = 0;
        int deuteros = 0;
        int result1 = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("please insert a two digit integer");
        digitsSum = in.nextInt();

        prwtos = digitsSum / 10;
        deuteros = digitsSum % 10;

        result1 = prwtos + deuteros;

        System.out.printf("οι αριθμοι ειναι οι %d , %d και το αθροισμα τους ειναι %d\n",prwtos , deuteros , result1 );
    }
}
