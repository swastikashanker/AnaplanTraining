package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HRManagementSystem {

    public void displayEmployees(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEid());
            System.out.println("Employee Name: " + employee.getEname());
            System.out.println("Work Location: " + employee.getWorkLocation());
            System.out.println("Years of Experience: " + employee.getYearsOfExperience());
            System.out.println();
        }
    }


    public  void sortByCountry(ArrayList<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getWorkLocation));
    }

    public  void sortById(ArrayList<Employee> employees) {
        employees.removeIf(employee -> employee.getYearsOfExperience() >= 1);
        employees.sort(Comparator.comparing(Employee::getEid));
    }

    public  List<Employee> createList(ArrayList<Employee> employees, boolean isEven) {
        List<Employee> collect = employees.stream()
                .filter(employee -> employee.getEid() % 2 == (isEven ? 0 : 1))
                .collect(Collectors.toList());
        return collect;
    }

    public  void displayEmployeeList(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getEid() + ", Name: " + employee.getEname());
        }
        System.out.println();
    }



    }


