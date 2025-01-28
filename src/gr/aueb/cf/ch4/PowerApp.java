package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 *  Calculate a ^n.
 *  e.g 2^10 = 1024
 */
public class PowerApp {

    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2;
        int power = 100;
        int result = 1;

        for ( int i = 1; i <= power; i++) {
            result *= base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.println("Result : " + bigResult);
    }
}
