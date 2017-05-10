package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Are we there yet");
            String userResponse = scanner.nextLine();
            if (userResponse.equals("Yes")) {
                System.out.println("Good");
                break;
            }
        }
    }

}
