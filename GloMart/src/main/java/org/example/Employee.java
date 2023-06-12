package org.example;
import java.util.ArrayList;
import java.util.List;


public class Employee {
    record Project(String pcode, String projectName, List<Employee> employees) {}

        private int eid;
        private String ename;
        private String workLocation;
        private int yearsOfExperience;

        public Employee(int eid, String ename, String workLocation, int yearsOfExperience) {
            this.eid = eid;
            this.ename = ename;
            this.workLocation = workLocation;
            this.yearsOfExperience = yearsOfExperience;
        }

        public int getEid() {
            return eid;
        }

        public String getEname() {
            return ename;
        }

        public String getWorkLocation() {
            return workLocation;
        }

        public int getYearsOfExperience() {
            return yearsOfExperience;
        }
    }








