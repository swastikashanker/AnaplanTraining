package com.glo.app.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glo.app.employee.model.Employee;
import com.glo.app.employee.service.EmployeeService;



@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	//Write Your code here to implement the required functionalities
	
	@PostMapping
	public ResponseEntity<Employee> addNewEmployeeDetails(@RequestBody Employee employee)
	{
		//write your code here
		return null;
	}
	
	@GetMapping
	//Pass required parameters to implement the functionality for paging and sorting
		public List<Employee> findDetailsOfAllEmployeesByPagingAndSorting() 
	   {  
		//Write Method to implement the paging and sorting functionality and create a REST Endpoint
		//Write your code here
	        return null;
	    }
	
	@GetMapping("/{id}")  
	public Employee findEmployeeDetailsByEmpId(@PathVariable long id)  
	{  
		//Write your code here
			return null;
	}
	
	@DeleteMapping("/{id}")  
	public String deleteEmployeeDetailsByEmpID(@PathVariable int id)  
	{  
	    return null;
	}
	@PutMapping("/{id}")  
	public ResponseEntity<Employee> updateEmployeeDetailsByEmoID(@PathVariable long id,@RequestBody Employee employee)  
	{  
		return null;
	}
	 
	
	
	}
