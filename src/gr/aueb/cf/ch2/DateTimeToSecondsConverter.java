package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρεπει ημερες ωρες λεπτα δευτερολεπτα
 * σε συνολογικα δευτερολεπτα. Ο χρηστης δινει τα δεδομενα και εκτυπωνεται το τελικο αποτελεσμα.
 */

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        final int SECONDS_PER_DAY= 3600 * 24;
        final int Seconds_Per_Hour = 3600;
        final int SECONDS_PER_MINUTE = 60;
        int totalSeconds = 0;

        Scanner in = new Scanner(System.in);
        int inputDays;
        int inputHours;
        int inputMinutes;
        int inputSeconds;


        System.out.println("Please insert days, hours, minutes, sceonds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds= inputDays * SECONDS_PER_DAY +inputHours * Seconds_Per_Hour
                + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        System.out.printf(Locale.US ,"TOTAL SECONDS %,d seconds\n", totalSeconds );



    }
}
