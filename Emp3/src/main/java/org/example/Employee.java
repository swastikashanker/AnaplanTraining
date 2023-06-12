package org.example;

public class Employee {
    private int employeeID;
    private String name;
    private String designation;
    private double salary;
    private Project project;

    public Employee(int employeeID, String name, String designation, double salary, Project project) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.project = project;
    }

    // Getters and setters for the Employee class

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + "\nName: " + name + "\nDesignation: " + designation +
                "\nSalary: " + salary + "\nProject: " + project;
    }

}
