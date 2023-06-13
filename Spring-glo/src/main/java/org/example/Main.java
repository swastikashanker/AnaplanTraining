package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring configuration
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        // Get the HRService bean from the Spring container
        HRService hrService = context.getBean(HRService.class);



        // Create an employee and add them to the system
        Address address = new Address("Patna", "Bihar", 800014);
        Employee employee = new Employee(1, "Swastika", "Shanker", "Employee", "IT", address);
//        Loan loan = new Loan();
//        loan.setLoanId(1);
//        loan.setEmpId(employee.getEmpId());
//        loan.setAmount(10000);
//        loan.setEmi(1000);
//        loan.setNoOfInstallment(10);
//        loan.setBalance(5000);
//        loan.setStatus("open");


        hrService.addEmployee(employee);



        // Retrieve employee details
        int empId = 1;
        Employee retrievedEmployee = hrService.getEmployeeDetails(empId);
        if (retrievedEmployee != null) {
            System.out.println("Employee details for employee ID " + empId + ":");
            System.out.println("Name: " + retrievedEmployee.getFirstName() + " " + retrievedEmployee.getLastName());
            System.out.println("Role: " + retrievedEmployee.getRole());
            System.out.println("Department: " + retrievedEmployee.getDepartment());
            System.out.println("Address: " + retrievedEmployee.getAddress().getCity() + ", "
                    + retrievedEmployee.getAddress().getState() + " " + retrievedEmployee.getAddress().getPincode());
        } else {
            System.out.println("Employee with ID " + empId + " not found.");
        }

        // Check loan eligibility
        boolean isEligible = hrService.isLoanEligible(employee);
        if (isEligible) {
            System.out.println("The employee is eligible for a loan.");
        } else {
            System.out.println("The employee is not eligible for a loan.");
        }
    }
}
