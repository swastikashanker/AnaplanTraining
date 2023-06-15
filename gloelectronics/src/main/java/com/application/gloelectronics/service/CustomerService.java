package com.application.gloelectronics.service;

import com.application.gloelectronics.dto.Customer;
import com.application.gloelectronics.dto.Product;
import com.application.gloelectronics.exception.CustomerException;
import com.application.gloelectronics.exception.ProductException;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer) throws CustomerException;
    Customer addProductToCustomer(int customerId, List<Product> productList) throws CustomerException, ProductException;
    String deleteCustomer(int customerId) throws CustomerException;
    List<Customer> getDetailsOfCustomers() throws CustomerException;
}
