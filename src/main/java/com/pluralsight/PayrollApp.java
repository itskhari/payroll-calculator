package com.pluralsight;

import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name?: ");
        String name = sc.nextLine();

        System.out.print("Okay " + name + ", how many hours did you work this pay period?: ");
        double hoursWorked = sc.nextDouble();
        sc.nextLine();

        System.out.print("Great! Now what is your hourly wage?: ");
        double hourlyWage = sc.nextDouble();
        sc.nextLine();

        double pay = hoursWorked * hourlyWage;

        System.out.println("Calculating your pay.");
        System.out.printf("Your pay is $%.2f for this period", pay);
    }
}
