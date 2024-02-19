package de.thephoenixpixel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start the Zahlen Dreieck");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe die max Zahl an");

        // get the max zahl
        int zahl = scanner.nextInt();

        print(zahl);
    }

    public static void print(int zahl) {
        for (int i = 1; i <= zahl; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}