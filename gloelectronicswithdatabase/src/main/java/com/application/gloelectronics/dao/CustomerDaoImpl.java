package com.application.gloelectronics.dao;

import com.application.gloelectronics.dto.Customer;
import com.application.gloelectronics.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerDaoImpl {
    private List<Customer> customers = new ArrayList<>();
//    @Override
    public Customer addCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

//    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

//    @Override
    public boolean deleteCustomerById(int customerId) {
        customers.remove(customerId);
        return true;
    }

//    @Override
//    public Boolean addProductToCustomersProductList(Customer customer,List<Product> products) {
//        return null;
//    }
}
