package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter employee's earnings: ");
                double earnings = scanner.nextDouble();

                double tax = calculateIncomeTax(earnings);

                System.out.println("Income tax is: " + tax);
            }

            public static double calculateIncomeTax(double earnings) {
                double tax = 0;

                if (earnings <= 50000) {
                    tax = 0;
                } else if (earnings <= 60000) {
                    tax = 0.1 * (earnings - 50000);
                } else if (earnings <= 150000) {
                    tax = 0.1 * 10000 + 0.2 * (earnings - 60000);
                } else {
                    tax = 0.1 * 10000 + 0.2 * 90000 + 0.3 * (earnings - 150000);
                }

                return tax;
            }
        }

