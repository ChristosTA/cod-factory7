package gr.aueb.cf.ch5;

/**
 * Υπολογιζει το παραγοντικο του N
 * n! = 1 * 2 * 3 *... * Ν
 */
public class Factorial {


    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(i + "! =" + facto(i));
        }
    }


    /**
     * Calculates n!.
     *
     * @param n         The input number
     * @return      the factorial of n
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;

    }
}
