package org.example;

import java.util.regex.Pattern;

public class Student {

        private int studentId;
        private String firstname;
        private String lastName;
        private String emailAddress;
        private int age;
        private String grade;

        public Student(int studentId, String firstname, String lastName, String emailAddress, int age, String grade) {
            this.studentId = studentId;
            this.firstname = firstname;
            this.lastName = lastName;
            this.emailAddress = emailAddress;
            this.age = age;
            this.grade = grade;
        }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void validateEmail() throws IllegalArgumentException {
            // Use regular expression to validate email format
            String emailPattern = "^[\\w.-]+@[\\w.-]+\\.[\\w]+$";
            if (!Pattern.matches(emailPattern, emailAddress)) {
                throw new IllegalArgumentException("Invalid email address format");
            }
        }

        public void validateFields() throws IllegalArgumentException {
            // Check if any required fields are empty
            if (studentId == 0) {
                throw new IllegalArgumentException("Student ID is required");
            }
            if (firstname.isEmpty()) {
                throw new IllegalArgumentException("First name is required");
            }
            if (lastName.isEmpty()) {
                throw new IllegalArgumentException("Last name is required");
            }
            if (emailAddress.isEmpty()) {
                throw new IllegalArgumentException("Email address is required");
            }
        }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}


