package com.application.gloelectronics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    @NotBlank(message = "product name is mandatory")
    private String productName;
    @NotBlank(message = "product price is mandatory")
    private double productPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
}
