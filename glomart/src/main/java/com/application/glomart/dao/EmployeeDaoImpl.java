package com.application.glomart.dao;

import com.application.glomart.dto.Employee;
import com.application.glomart.exception.EmployeeException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private static List<Employee> employees = new ArrayList<>();
    @Override
    public boolean addEmployee(Employee employee) {
        if(employees.contains(employee)){
            return false;
        }
        employees.add(employee);
        return true;
    }

    @Override
    public Employee getEmployee(int employeeId) throws EmployeeException {
        Employee employee = new Employee();
        try{
             employee = employees.get(employeeId-1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        if(employee == null){
            throw new EmployeeException(" Employee not exists !!!");
        }
        return employee;
    }
}
