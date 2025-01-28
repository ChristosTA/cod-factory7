package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το αθροισμα των ψηφιων
 * ενος ακεραιου. Για παραδειγμα το αθροισμα των ψηφιων του 123 ειναι 6
 */

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive Integer");
        inputNum = in.nextInt();

        tempNum = inputNum;
        while ( tempNum > 0) {
            rightDigit = tempNum % 10;
            sum +=  rightDigit; // sum = sum * rightDigit
            tempNum /= 10; // tempNum = tempNum /10;



        }

        System.out.println("The sum of digits of " + inputNum + " is " + sum);
    }
}
