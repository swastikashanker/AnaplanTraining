package com.application.glomart.service;

import com.application.glomart.dto.Employee;
import com.application.glomart.exception.EmployeeException;

import java.util.List;

public interface EmployeeService {
    String addEmployee(Employee employee) throws EmployeeException;
    Employee getEmployee(int employeeId) throws EmployeeException;

    String checkLoanEligibility(int employeeId) throws EmployeeException;

}
