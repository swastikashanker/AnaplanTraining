package com.application.gloelectronics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Customer {
    @NotBlank(message = "Customer id is mandatory")
    private int customerId;
    @NotBlank(message = "Customer name is mandatory")
    private String customerName;
    private List<Product> productList = new ArrayList<>();
}
