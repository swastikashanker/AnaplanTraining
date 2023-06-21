package com.glo.app.employee.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.glo.app.employee.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	//Write Your Code here for Paging and sorting 
	
	
}

