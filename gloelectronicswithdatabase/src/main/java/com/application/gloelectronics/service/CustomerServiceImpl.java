package com.application.gloelectronics.service;

import com.application.gloelectronics.dao.CustomerDao;
import com.application.gloelectronics.dao.CustomerDaoImpl;
import com.application.gloelectronics.dao.ProductDao;
import com.application.gloelectronics.dao.ProductDaoImpl;
import com.application.gloelectronics.dto.Customer;
import com.application.gloelectronics.dto.Product;
import com.application.gloelectronics.exception.CustomerException;
import com.application.gloelectronics.exception.ProductException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private ProductDao productDao;
    @Autowired
    private CustomerDao customerDao;
    @Override
    public Customer addCustomer(Customer customer) throws CustomerException {
        if(findCustomerInDb(customer.getCustomerId())){
            throw new CustomerException("Customer already present !!!");
        }
        return customerDao.save(customer);
    }

    @Override
    public Customer addProductToCustomer(int customerId, List<Product> productList) throws CustomerException, ProductException{
        if(!findCustomerInDb(customerId)){
            throw new CustomerException("Customer is not present !!!");
        }
        List<Customer> customersList = customerDao.findAll().stream().
                filter(customer -> customer.getCustomerId() == customerId).collect(Collectors.toList());
        Customer customer = customersList.get(0);
        List<Product> listOfProducts = productDao.findAll();
        if(listOfProducts.containsAll(productList)){
            customer.getProductList().addAll(productList);
            customerDao.save(customer);
            return customer;
        }
        throw new ProductException("Product you wants to purchase is not present in the Inventory(Product list)");
    }

    @Override
    public String deleteCustomer(int customerId) throws CustomerException {
        if(!findCustomerInDb(customerId)){
            throw new CustomerException("Customer not present");
        }
        customerDao.deleteById(customerId);
            return "Deletion is successful";
    }

    @Override
    public List<Customer> getDetailsOfCustomers() throws CustomerException {
        List<Customer> customers = customerDao.findAll();
        if(customers.isEmpty()){
            throw new CustomerException("No customer is present !!!");
        }
        return customers;
    }

    public boolean findCustomerInDb(int customerId) {
        List<Customer> customers = customerDao.findAll();
        long count = customers.stream().filter(customer -> customer.getCustomerId() == customerId).count();
        if(count > 0){
            return true;
        }
        return false;
    }
}
