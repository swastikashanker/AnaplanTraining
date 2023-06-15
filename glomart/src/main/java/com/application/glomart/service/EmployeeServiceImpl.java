package com.application.glomart.service;

import com.application.glomart.dao.EmployeeDaoImpl;
import com.application.glomart.dao.LoanDaoImpl;
import com.application.glomart.dto.Employee;
import com.application.glomart.dto.Loan;
import com.application.glomart.exception.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDaoImpl employeeDao;
    @Autowired
    private LoanDaoImpl loanDao;
    @Override
    public String addEmployee(Employee employee) throws EmployeeException {
        boolean isAdded = employeeDao.addEmployee(employee);
        if(isAdded){
            return employee.getFirstName() +" "+employee.getLastName() + " Added to the DB";
        }
        throw new EmployeeException("Employee Already Present !!!");
    }

    @Override
    public Employee getEmployee(int employeeId) throws EmployeeException{
        return employeeDao.getEmployee(employeeId);
    }

    @Override
    public String checkLoanEligibility(int employeeId) throws EmployeeException{
        Employee employee = getEmployee(employeeId);
        if(employee.getRole().equalsIgnoreCase("manager") || employee.getRole().equalsIgnoreCase("GM")){
            return employee.getFirstName() +" "+employee.getLastName() + " you are not eligible";
        }
        List<Loan> loanList = loanDao.getLoanList();
        long count = loanList.stream().
                filter(loan -> loan.getEmployeeId() == employeeId).
                count();
        if(count < 1){
            return employee.getFirstName() +" "+employee.getLastName() + " you are eligible";
        }
        long openLoanCount = loanList.stream().
                filter(loan -> loan.getEmployeeId() == employeeId).
                filter(loan -> loan.getStatus().equalsIgnoreCase("open")).count();
        if(openLoanCount > 0){
            return employee.getFirstName() +" "+employee.getLastName() + " you are not eligible";
        }
        return employee.getFirstName() +" "+employee.getLastName() + " you are  eligible";
    }
}
