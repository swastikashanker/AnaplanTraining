package com.application.glomart.controller;

import com.application.glomart.dto.Employee;
import com.application.glomart.exception.EmployeeException;
import com.application.glomart.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId) throws EmployeeException{
            return new ResponseEntity<>( employeeService.getEmployee(employeeId), HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) throws EmployeeException {
        return new ResponseEntity<>(employeeService.addEmployee(employee),HttpStatus.CREATED);
    }
    @GetMapping("/loan/{employeeId}")
    public ResponseEntity<String> checkLoanEligibility(@PathVariable int employeeId) throws EmployeeException{
         return new ResponseEntity<>(employeeService.checkLoanEligibility(employeeId),HttpStatus.OK);
    }

}
