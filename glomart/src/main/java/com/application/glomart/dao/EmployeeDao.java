package com.application.glomart.dao;

import com.application.glomart.dto.Employee;
import com.application.glomart.exception.EmployeeException;

import java.util.List;

public interface EmployeeDao {
    boolean addEmployee(Employee employee);
    Employee getEmployee(int employeeId) throws EmployeeException;
}
