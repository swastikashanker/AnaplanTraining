package com.application.gloelectronics.controller;

import com.application.gloelectronics.dto.Customer;
import com.application.gloelectronics.dto.Product;
import com.application.gloelectronics.exception.CustomerException;
import com.application.gloelectronics.exception.ProductException;
import com.application.gloelectronics.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> getCustomerDetails() throws CustomerException{
        return new ResponseEntity<>(customerService.getDetailsOfCustomers(),HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) throws CustomerException {
        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }
    @PutMapping("/add/product/{customerId}")
    public ResponseEntity<Customer> addProductToCustomer(@PathVariable int customerId, @RequestBody List<Product> products) throws CustomerException, ProductException {
        return new ResponseEntity<>(customerService.addProductToCustomer(customerId,products),HttpStatus.OK);
    }
    @DeleteMapping("/{customerId}")
    public ResponseEntity<String> deleteCustomer(@PathVariable int customerId) throws CustomerException{
        return new ResponseEntity<>(customerService.deleteCustomer(customerId),HttpStatus.OK);
    }
}
