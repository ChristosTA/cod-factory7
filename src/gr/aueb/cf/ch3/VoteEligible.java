package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαιωμα Ψηφου σε ηλικιες > 18
 * ελεγχει αν μια ηλικια εχει δικαιωμα να ψηφισει
 */

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int VOTING_AGE = 18;
        int age;
        boolean isEligible = false;

        System.out.println("Δωστε μια ηλικια");
        age = in.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.printf("Εχεις δικαιωμα ψηφου %b " , isEligible);


    }
}
