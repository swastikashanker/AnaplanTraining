package com.application.gloelectronics.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    @NotBlank(message = "Customer name is mandatory")
    private String customerName;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonIgnore
    private List<Product> productList = new ArrayList<>();
}
