package gr.aueb.cf.ch2;

import java.util.function.DoubleFunction;

/**
 * Εμφανιζει τους τυπους δεδομενων ακεραιων
 * int, byte,short,long μαζι με το μεγεθος τους,
 * το range (min/max).
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("int. size: %d bits, min: %,d, max: %,d \n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE );
        System.out.printf("byte. size: %d bits, min: %d max: %d \n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE );
        System.out.printf("short. size: %d bits, min: %d, max %d\n", Short.BYTES *8, Short.MIN_VALUE, Short.MAX_VALUE );
        System.out.printf("Long. size : %d bits, min: %,d, max %,d\n", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
    }


}
