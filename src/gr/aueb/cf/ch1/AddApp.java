package gr.aueb.cf.ch1;

/**
 * calculates the sum of two integers.
 * and the result is printed at console
 * (standard output)
 *
 */
public class AddApp {


    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων//
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //εντολες
        result = num1 + num2;

        //εκτυπωση του αποτελεσματος
        System.out.println("το αποτελεσμα ειναι : " + result);
        System.out.printf("το αθροισμα των %d" , result );

    }
}
