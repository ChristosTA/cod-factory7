package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
Δινει ο χρηστης εναν ακεραιο (θερμοκρασια)
κανει την μετατροπη απο F σε Κελσιου
 */

public class Convert {

    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int f,c;
        System.out.println("Δωστε Θερμοκρασια σε Fahrenheit: " );
        f = in.nextInt();
        c=  5 * (f-32) /9;

        //System.out.println("Η μετατροπη του " + num1 + " σε Κελσιου ειναι " + num2);
        System.out.printf("Η μετατροπη του %d σε Κελισου ειναι %d",  f ,  c);

    }
}
