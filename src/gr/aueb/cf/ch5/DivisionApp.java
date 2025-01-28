package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Double Demo
 */

public class DivisionApp {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double div = 0d;
        double mod = 0.0;
        float myFloat = 4.5F;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter two doubles");
        num1 = in.nextDouble();
        num2 = in.nextDouble();

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div : %.2f \n",div);
        System.out.printf("Mod : %.2f",mod);
    }
}
