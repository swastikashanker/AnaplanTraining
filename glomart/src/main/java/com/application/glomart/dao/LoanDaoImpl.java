package com.application.glomart.dao;

import com.application.glomart.dto.Loan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoanDaoImpl implements LoanDao{
    private List<Loan> loans = new ArrayList<>();

    @Override
    public List<Loan> getLoanList() {
        return loans;
    }
}
