package com.application.gloelectronics.dao;

import com.application.gloelectronics.dto.Customer;
import com.application.gloelectronics.dto.Product;

import java.util.List;

public interface CustomerDao {
    Customer addCustomer(Customer customer);
    List<Customer> getCustomers();
    boolean deleteCustomerById(int customerId);
//    Boolean addProductToCustomersProductList(Customer customer,List<Product> products);
}
