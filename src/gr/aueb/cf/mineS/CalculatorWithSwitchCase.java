package gr.aueb.cf.mineS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorWithSwitchCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please insert two Integers");
            while (!in.hasNextInt()){
                System.err.println("Please Insert Two Integers");
                in.nextLine();
            }
            num1 =in.nextInt();
            num2 =in.nextInt();

        System.out.println("Please Select tha ocassion\n1.ADD\n2.DES\n3.MUL\n4.DIV");
        choice = in.nextInt();
        try {

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = des(num1, num2);
                    break;
                case 3:
                    result = mul(num1, num2);
                    break;
                case 4:
                    result = div(num1, num2);
                    break;
            }
        }catch (ArithmeticException e) {

        } catch (Exception e) {

        }
        System.out.println("Result is :" +result);

    }



    static public int add(int x , int y) {
        return  x + y;
    }

    static public int des(int x , int y) {
        return  x - y;
    }

    static public int mul (int x , int y) {
        return  x * y ;
    }

    static public  int div (int x , int y) throws Exception {
        try {
            if (y == 0) throw new Exception("Denominator cannot be zero");
            return x / y;
        }catch (Exception e) {
            System.err.println("Error " + e.getMessage());
            throw e;
        }
    }
}
