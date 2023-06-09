package org.example;


   public class EmployeeSystem {
        private Employee[] employees;
        private int numEmployees;

        public EmployeeSystem(int maxSize) {
            employees = new Employee[maxSize];
            numEmployees = 0;
        }

        public void addEmployee(Employee employee) {
            if (numEmployees == employees.length) {
                System.out.println("Employee system is full. Cannot add more employees.");
                return;
            }

            int employeeId = employee.getId();
            if (findEmployeeIndexById(employeeId) != -1) {
                System.out.println("Employee with ID " + employeeId + " already exists.");
                return;
            }

            employees[numEmployees] = employee;
            numEmployees++;
            System.out.println("Employee added successfully.");
        }

        public void removeEmployee(int employeeId) {
            int employeeIndex = findEmployeeIndexById(employeeId);
            if (employeeIndex == -1) {
                System.out.println("Employee with ID " + employeeId + " does not exist.");
                return;
            }

            for (int i = employeeIndex; i < numEmployees - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[numEmployees - 1] = null;
            numEmployees--;
            System.out.println("Employee removed successfully.");
        }

        public void displayAllEmployees() {
            if (numEmployees == 0) {
                System.out.println("No employees found.");
                return;
            }

            for (int i = 0; i < numEmployees; i++) {
                System.out.println(employees[i]);
            }
        }

        public void updateEmployee(int employeeId, String newName, String newDesignation, double newSalary) {
            int employeeIndex = findEmployeeIndexById(employeeId);
            if (employeeIndex == -1) {
                System.out.println("Employee with ID " + employeeId + " does not exist.");
                return;
            }

            Employee employee = employees[employeeIndex];
            employee.setName(newName);
            employee.setDesignation(newDesignation);
            employee.setSalary(newSalary);
            System.out.println("Employee information updated successfully.");
        }

        private int findEmployeeIndexById(int employeeId) {
            for (int i = 0; i < numEmployees; i++) {
                if (employees[i].getId() == employeeId) {
                    return i;
                }
            }
            return -1;
        }
    }

