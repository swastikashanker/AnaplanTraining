package com.application.glomart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String role;
    private Address address;
}
