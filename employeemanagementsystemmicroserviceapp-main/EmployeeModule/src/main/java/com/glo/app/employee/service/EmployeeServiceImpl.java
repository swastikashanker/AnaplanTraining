package com.glo.app.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glo.app.employee.model.Employee;
import com.glo.app.employee.repository.EmployeeRepository;
import com.glo.app.employee.exceptionHandling.EmployeeNotFoundException;

//This is an Implementation class of EmployeeService
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee addNewEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	//Pass required parameters to implement the functionality for paging and sorting
	public List<Employee> findDetailsOfEmployeesByPagingAndSorting(){
		// TODO Auto-generated method stub
		// Write your logic or code to implement Paging and Sorting
		return null;
		
	}

	@Override
	public Employee findDetailsByEmpId(long Emp_id) {
		// TODO Auto-generated method stub
		Employee emp= repo.findById(Emp_id).get();  
		if(emp==null)  
		//runtime exception  
			throw new EmployeeNotFoundException("id: "+ Emp_id); 
		return emp;
		
	}

	@Override
	public void deleteEmployeeById(long Emp_id) {
		// TODO Auto-generated method stub
		Employee employee= repo.findById(Emp_id).get();
		if(employee==null)  
			//runtime exception  
				throw new EmployeeNotFoundException("id: "+ Emp_id); 
		repo.deleteById(Emp_id);
	}

	@Override
	public Employee updateEmployeeDetailsByEmpID(Employee employee, long Emp_id) {
		// TODO Auto-generated method stub
      //Write Your code here to update details of Employee based on employee id
		return null;
	}

	
	
}
