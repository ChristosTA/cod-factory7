package gr.aueb.cf.ch2;


import java.util.Scanner;

/**
 * Scanner demo.Reads two Intergers from the Std input(keyboard) and calculates the result
 *
 */
public class ScannerAddApp {

    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        //Εντολες
        System.out.println("Δωσε 2 ακεραιους αριθμους");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτυπωση αποτελεσματων
        System.out.printf("Το αποτελεσμα ειναι : %d",sum);
    }
}
