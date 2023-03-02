package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenhit;
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius to fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter fahrenheit: ");
                    fahrenhit = scanner.nextDouble();
                    System.out.println("Fahrenheit to celsius : " + fahrenheitToCelsius(fahrenhit));
                    break;
                case 2:
                    System.out.println("enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("chọn 0 , 1 hoặc 2");

            }
        } while (choice != 0);


    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}