package org.example;

import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Roger", "UK", 1);
        Employee e2 = new Employee(102, "Sam", "India", 3);
        Employee e3 = new Employee(103, "Xiang", "China", 7);

       // HRManagementSystem hr=new HRManagementSystem();
        // Create project details
        Employee.Project project = addProjectDetails("p101", "Anaplan", List.of(e1, e2, e3));

        // Print project details
        System.out.println(project);
    }

    public static Employee.Project addProjectDetails(String pcode, String projectName, List<Employee> employees) {
        return new Employee.Project(pcode, projectName, employees);
    }
}
