package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;


        do {
            System.out.println("Insert a num to guess the secret");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Secret Found");
                isSuccess = true;
            } else { //num != SECRET
                System.out.println("Try again");
            }

        } while(!isSuccess);

        }


    }

