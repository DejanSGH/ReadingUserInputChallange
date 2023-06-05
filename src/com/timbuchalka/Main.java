package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        while (counter < 11) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
//                sum += scanner.nextInt();
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid input");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum = " + sum);
    }
}
