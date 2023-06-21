package com.glo.app.employee.exceptionHandling;



public class EmployeeNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String message) {
    	super(message);
    	this.message=message;
		// TODO Auto-generated constructor stub
	}

	private String message;

}
