package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 *
 */

public class ExceptionTypes {

    public static void main(String[] args) {

    }

    /**
     * System.in.read() throws IOException.
     * since a checked exception is thrown
     * it has to be explicitly to be thrown in method signature.
     * or has to be caught {}
     * when this type of method / exception may be used?
     * when no need to handle the exception.
     * is this meaningful? No.Ideally we want to handle
     * exceptions, not only propagate.
     *
     * @return
     * @throws IOException
     */
    public static char readOneChar () throws IOException {
        return (char) System.in.read();
    }

    /**
     * if we catch the exception, no need for 'throws'
     * in method signature.And the exception not propagates.
     * is it a good practice not to propagate?
     * it depends. If there is caller , then we have to propagate.
     * if there is a client / user then we do not propagate the exception.
     *
     * @return
     */
    public static char readAnotherChar () {
        try {
            return (char) System.in.read();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            return ' ';
        }
    }

    public static char readAnotherOneChar () throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            throw ex;
        }

    }

    public static char readAgainOneChar(char ch) throws IOException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        }catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }



//        } catch (IllegalArgumentException ex1) {
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//        }

    }
}
