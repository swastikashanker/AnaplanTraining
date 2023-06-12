package org.example;

public class EmployeeSystem {
    private Employee[] employees;
    private int numEmployees;

    public EmployeeSystem(int maxSize) {
        employees = new Employee[maxSize];
        numEmployees = 0;
    }

    public void addEmployee(int employeeID, String name, String designation, double salary, Project project) {
        Employee employee = new Employee(employeeID, name, designation, salary, project);
        employees[numEmployees] = employee;
        numEmployees++;
    }

    public void removeEmployee(int employeeID) {
        int index = findEmployeeIndex(employeeID);
        if (index != -1) {
            for (int i = index; i < numEmployees - 1; i++) {
                employees[i] = employees[i + 1];
            }
            numEmployees--;
            employees[numEmployees] = null;
            System.out.println("Employee with ID " + employeeID + " has been removed.");
        } else {
            System.out.println("Employee with ID " + employeeID + " not found.");
        }
    }

    public void displayAllEmployees() {
        if (numEmployees == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < numEmployees; i++) {
            System.out.println(employees[i]);
            System.out.println("--------------------");
        }
    }

    public void updateEmployee(int employeeID, String name, String designation, double salary) {
        int index = findEmployeeIndex(employeeID);
        if (index != -1) {
            Employee employee = employees[index];
            employee.setName(name);
            employee.setDesignation(designation);
            employee.setSalary(salary);
            System.out.println("Employee with ID " + employeeID + " has been updated.");
        } else {
            System.out.println("Employee with ID " + employeeID + " not found.");
        }
    }

    private int findEmployeeIndex(int employeeID) {
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getEmployeeID() == employeeID) {
                return i;
            }
        }
        return -1;
    }
}
