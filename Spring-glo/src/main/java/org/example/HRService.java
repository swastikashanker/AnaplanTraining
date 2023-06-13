package org.example;

    public interface HRService {
        void addEmployee(Employee employee);
        Employee getEmployeeDetails(int empId);
        boolean isLoanEligible(Employee employee);
    }


