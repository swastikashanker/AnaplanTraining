package org.example;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        List<Employee> employees = employeeService.getEmployeesFromUserInput();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Fetch employees with salary above a specific amount");
            System.out.println("2. Fetch employees sorted by name");
            System.out.println("3. Fetch employees with names in uppercase");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the amount: ");
                    double amount = scanner.nextDouble();

                    try {
                        List<Employee> filteredEmployees = employeeService.filterEmployeesAboveSalary(employees, amount);
                        System.out.println("\nEmployees with salary above " + amount + ":");
                        filteredEmployees.forEach(System.out::println);
                    } catch (NoEmployeeFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    List<Employee> sortedEmployees = employeeService.sortEmployeesByName(employees);
                    System.out.println("\nEmployees sorted by name:");
                    sortedEmployees.forEach(System.out::println);
                    break;

                case 3:
                    List<Employee> uppercaseEmployees = employeeService.convertEmployeeNamesToUpperCase(employees);
                    System.out.println("\nEmployees with names in uppercase:");
                    uppercaseEmployees.forEach(System.out::println);
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
