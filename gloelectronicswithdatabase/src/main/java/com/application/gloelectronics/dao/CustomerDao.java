package com.application.gloelectronics.dao;

import com.application.gloelectronics.dto.Customer;
import com.application.gloelectronics.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {
//    Customer addCustomer(Customer customer);
//    List<Customer> getCustomers();
//    boolean deleteCustomerById(int customerId);
//    Boolean addProductToCustomersProductList(Customer customer,List<Product> products);
}
