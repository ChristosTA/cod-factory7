package gr.aueb.cf.ch2;

import java.util.Scanner;


public class EuroUsdConverter {

    public static void main(String[] args) {
        //Δηλωση και Ααρχικοποιηση μεταβλητων
        final int Parity = 99;
        int inputEuros = 0;
        int usaDollars = 0;
        int usaCents = 0;
        int totalUsaCents =0;
        Scanner in = new Scanner(System.in);

        //εντολες
        System.out.println("Δωσε Τιμη για μετρατροπη");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * Parity;
        usaDollars= totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτυπωση
        System.out.printf("%d \u20AC = %d \u0024 ,  %d usa cent",inputEuros , usaDollars, usaCents );

    }
}
