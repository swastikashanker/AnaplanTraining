package com.application.glomart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Loan {
    private int loanId;
    private int employeeId;
    private double amount;
    private double emi;
    private int noOfInstal;
    private double balance;
    private String status;
}
