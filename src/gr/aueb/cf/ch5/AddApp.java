package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το αθροισμα δυο ακεραιων
 * με τη χρηση μεθοδων.
 */
public class AddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please insert two Integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = AddApp.add(num1 , num2);  //πληρης ονομα κλασης αμα θες να την καλεσεις σε διαφορετικη κλαση
        sub = sub(num1 , num2);  //ετσι μπορει να την ''φωναξεις'' μονο οταν ειναι στην ιδια κλαση

        System.out.println(sum);
        System.out.println(sub);

    }

    /**
     * adds two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int add(int a, int b) {
//        int result = 0;
//
//        result = a + b;
//
//        return result;

        return  a + b;  //αντι για τα πανω για πιο καθαρο και readable κωδικα
    }

    /**
     * Subtracts two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sub of the two integers
     */
    public static int sub( int a , int b) {
        return a - b;
    }
}
