package org.example;

public class Main {
    public static void main(String[] args) {

        EmployeeSystem employeeSystem = new EmployeeSystem(100);

        // Add employees
        Employee emp1 = new Employee(1, "John Doe", "Manager", 5000.0);
        employeeSystem.addEmployee(emp1);

        Employee emp2 = new Employee(2, "Jane Smith", "Developer", 4000.0);
        employeeSystem.addEmployee(emp2);

        // Display all employees
        System.out.println("All Employees:");
        employeeSystem.displayAllEmployees();

        // Update employee information
        employeeSystem.updateEmployee(1, "John Doe", "Senior Manager", 6000.0);

        // Display all employees after update
        System.out.println("All Employees (after update):");
        employeeSystem.displayAllEmployees();

        // Remove an employee
        employeeSystem.removeEmployee(2);

        // Display all employees after removal
        System.out.println("All Employees (after removal):");
        employeeSystem.displayAllEmployees();
    }
    }
