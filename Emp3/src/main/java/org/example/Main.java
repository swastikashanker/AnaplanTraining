package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeSystem system = new EmployeeSystem(100);

        // Adding employees
        Project project1 = new Project(1, "Project A");
        Project project2 = new Project(2, "Project B");

        system.addEmployee(1, "Jai Singh", "Manager", 5000.0, project1);
        system.addEmployee(2, "Ram Pandey", "Developer", 3000.0, project1);
        system.addEmployee(3, "Veer Mehta", "Designer", 4000.0, project2);

        // Displaying all employees
        system.displayAllEmployees();

        // Removing an employee
        system.removeEmployee(2);

        // Updating an employee
        system.updateEmployee(3, "Mukesh Kumar", "Senior Designer", 4500.0);

        // Displaying all employees again
        system.displayAllEmployees();
    }
}