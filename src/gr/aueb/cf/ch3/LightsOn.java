package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark
 */
public class LightsOn {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isDark = false;
        int carSpeed;
        final int MAX_CAR_SPEED= 100;
        boolean isCarRunning = false;
        boolean isLightson = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();
        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please inser car speed");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        //isLightson = isRaining && (isDark || isCarRunning);
        isLightson = (isRaining && isDark) || (isRaining && isCarRunning);

        System.out.println("Turn lights on : " + isLightson);






    }
}
