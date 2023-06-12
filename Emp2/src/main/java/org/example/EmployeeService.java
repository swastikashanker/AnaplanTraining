package org.example;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeService {

    public List<Employee> filterEmployeesAboveSalary(List<Employee> employees, double amount) throws NoEmployeeFoundException {
        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > amount)
                .collect(Collectors.toList());

        if (filteredEmployees.isEmpty()) {
            throw new NoEmployeeFoundException("No Employee with salary above " + amount + " found");
        }

        return filteredEmployees;
    }

    public List<Employee> sortEmployeesByName(List<Employee> employees) {
        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()))
                .collect(Collectors.toList());

        return sortedEmployees;
    }

    public List<Employee> convertEmployeeNamesToUpperCase(List<Employee> employees) {
        employees.forEach(Employee::convertNameToUpperCase);
        return employees;
    }

    public List<Employee> getEmployeesFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Designation: ");
            String designation = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employees.add(new Employee(employeeId, name, designation, salary));
        }

        return employees;
    }
}

