package gr.aueb.cf.ch6;

/**
 * demo of Deep copy
 */

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copied;
        copied = arrrDeepCopy(arr);


        System.out.print(copied + " ");

    }

    /**
     * it creates a fresh copy (deep copy) of an
     * input array
     * @param source    the source array
     * @return      the copied array
     */
    public static int[] arrrDeepCopy(int[] source ) {
        int[] destination = new int[source.length];

        for (int i = 0; i < source.length;i++) {
            destination[i] = source[i];
        }

//        System.arraycopy(source,0, destination,0,source.length);
//        destination = Arrays.copyOf(source,source.length);
//        destination = Arrays.copyOfRange(source,0,source.length);

        return destination;
    }
}
