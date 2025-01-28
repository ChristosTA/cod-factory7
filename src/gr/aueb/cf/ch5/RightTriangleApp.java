package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Check if a triangle is right
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;

        System.out.printf("Please enter B , c ,a ");
        b = in.nextDouble();
        c = in.nextDouble();
        a = in.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.printf("Triangle is right");
        } else {
            System.out.printf("Triangle is not right");
        }
    }
}
