package com.glo.app.employee.service;

import java.util.List;

import com.glo.app.employee.model.Employee;

public interface EmployeeService {	
	Employee addNewEmployeeDetails(Employee employee);	
	//Pass required parameters to implement the functionality for paging and sorting
	List<Employee> findDetailsOfEmployeesByPagingAndSorting();
	Employee findDetailsByEmpId(long Emp_id);
	void deleteEmployeeById(long Emp_id);
	Employee updateEmployeeDetailsByEmpID(Employee employee, long Emp_id);

	
}
