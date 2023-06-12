package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        // Create employees and add them to the ArrayList
        employees.add(new Employee(101, "Roger", "UK", 1));
        employees.add(new Employee(102, "Sam", "India", 3));
        employees.add(new Employee(103, "Xiang", "China", 7));
        employees.add(new Employee(104, "Willey", "US", 4));
        employees.add(new Employee(105, "Jane", "India", 20));

        HRManagementSystem hr=new HRManagementSystem();
        // Display employee details
        hr.displayEmployees(employees);
//        //Sort by country and then display
         hr.sortByCountry(employees);
         hr.displayEmployees(employees);
//

        // Create separate lists for even and odd employee numbers
        List<Employee> evenEmployeeList = hr.createList(employees, true);
        List<Employee> oddEmployeeList = hr.createList(employees, false);

        // Display the even employee list
        System.out.println("Even Employee List:");
        hr.displayEmployeeList(evenEmployeeList);

        // Display the odd employee list
        System.out.println("Odd Employee List:");
        hr.displayEmployeeList(oddEmployeeList);





    }


}