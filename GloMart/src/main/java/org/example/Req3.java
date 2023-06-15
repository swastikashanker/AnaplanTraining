package org.example;

import java.util.ArrayList;

public class Req3 {
    public static void main(String[] args) {
        ArrayList<Employee> employees2 = new ArrayList<>();
        // Create employees and add them to the ArrayList
        employees2.add(new Employee(110, "Ram", "UK", 1));
        employees2.add(new Employee(112, "Shyam", "India", 3));
        employees2.add(new Employee(103, "Binu", "China", 7));
        employees2.add(new Employee(104, "Wil", "US", 4));
        employees2.add(new Employee(109, "James", "India", 20));

        HRManagementSystem hr=new HRManagementSystem();
        // Sort employees by ID for those who joined less than a year ago
       hr.sortById(employees2);

        // Display employee IDs
//        for (Employee employee : employees2) {
//            System.out.println(employee.getEid());
        }
    }

