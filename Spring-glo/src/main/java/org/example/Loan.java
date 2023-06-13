package org.example;

public class Loan {
        private int loanId;
        private int empId;
        private double amount;
        private double emi;
        private int noOfInstallment;
        private double balance;
        private String status;

        // Getters and setters


    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public int getNoOfInstallment() {
        return noOfInstallment;
    }

    public void setNoOfInstallment(int noOfInstallment) {
        this.noOfInstallment = noOfInstallment;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Loan() {
    }

    // Constructor
        public Loan(int loanId, int empId, double amount, double emi, int noOfInstallment, double balance, String status) {
            this.loanId = loanId;
            this.empId = empId;
            this.amount = amount;
            this.emi = emi;
            this.noOfInstallment = noOfInstallment;
            this.balance = balance;
            this.status = status;
        }
    }


