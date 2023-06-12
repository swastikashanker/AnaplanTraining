package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a student object
            Student student = new Student(1234, "Swastika", "Shanker", "swastika.135@gmail.com", 20, "A");

            // Validate the student object
            student.validateEmail();
            student.validateFields();

            // Print the student object
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("First Name: " + student.getFirstname());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Email Address: " + student.getEmailAddress());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
