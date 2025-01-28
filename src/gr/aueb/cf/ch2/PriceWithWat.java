package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculate the price with vat 24%
 */
public class PriceWithWat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double VAT_RATE = 0.24;
        double product = 0;
        double result = 0;
        double vat = 0;

        System.out.println("Please insert a price");
        product = in.nextDouble();
        vat = product * VAT_RATE;
        result = vat + product;

        System.out.printf("Price : %.2f" , result);




    }
}
