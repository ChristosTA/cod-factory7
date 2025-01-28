package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("1234567894141235114");
        BigInteger bigNum2 = new BigInteger("1241455346376745745783");
        BigInteger result;

        result = bigNum1.add(bigNum2);
        System.out.printf("%,d ", result);
    }
}
