package org.example;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class HRServiceImpl implements HRService  {

    private List<Employee> employeeList = new ArrayList<>();
    private List<Loan> loanList = new ArrayList<>();


        @Override
        public void addEmployee(Employee employee) {
            employeeList.add(employee);

        }

        @Override
        public Employee getEmployeeDetails(int empId) {
            for (Employee employee : employeeList) {
                if (employee.getEmpId() == empId) {
                    return employee;
                }
            }
            return null;
        }

        @Override
        public boolean isLoanEligible(Employee employee) {
            String role = employee.getRole();
            if (role.equalsIgnoreCase("Manager") || role.equalsIgnoreCase("GM")) {
                return false; // Not eligible for a loan
            }

            for (Loan loan : loanList) {
                if (loan.getEmpId() == employee.getEmpId() && loan.getStatus().equalsIgnoreCase("open")) {
                    return false; // Employee already has an open loan
                }
            }
            return true; // Eligible for a loan
        }
        }



