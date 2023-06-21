package com.glo.app.employee.model;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Employee {
	@Id
	private Long empId;
	
	String first_name;
	public Long getEmpId() {
		return empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long empId, String first_name, String last_name, String email, String department, String position,
			Long salary) {
		super();
		this.empId = empId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.department = department;
		this.position = position;
		Salary = salary;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	String last_name;
	String email;
	String department;
	String position;
	Long Salary;
	

	
	
	
}