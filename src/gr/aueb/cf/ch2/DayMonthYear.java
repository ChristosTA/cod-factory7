package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 Δινει ο χρηστης 3 ακεραιους
 και τους εμφανιζει σε μορφη ημερομηνιας day/month/year
 */
public class DayMonthYear {

    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int num1 , num2 , num3;
        System.out.println("Επιλεξτε Ημερομηνια");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.printf("Η ημερομηνια που εδωσες ειναι %02d/%02d/%4d", num1 , num2 , num3);

    }
}
