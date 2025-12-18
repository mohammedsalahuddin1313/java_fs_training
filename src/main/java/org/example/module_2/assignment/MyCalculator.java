package org.example.module_2.assignment;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exited Successfully!!!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();

                    System.out.println("Result: " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    double c = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    double d = sc.nextDouble();

                    System.out.println("Result: " + (c - d));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    double e = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    double f = sc.nextDouble();

                    System.out.println("Result: " + (e * f));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    double g = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    double h = sc.nextDouble();

                    if (h == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    else {
                        System.out.println("Result: " + (g / h));
                    }
                    break;

                default:
                    System.out.println("Invalid option! Please enter from option 1 to 5.");
            }
        }

        sc.close();
    }
}
