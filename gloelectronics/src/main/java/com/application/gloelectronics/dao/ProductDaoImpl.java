package com.application.gloelectronics.dao;

import com.application.gloelectronics.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{
    Product product1 = new Product(1,"Phone",50000);
    Product product2 = new Product(2,"Fridge",30000);
    Product product3 = new Product(3,"Laptop",40000);
    private List<Product> productList = Arrays.asList(product1,product2,product3);
    @Override
    public List<Product> getListOfProducts() {
        return productList;
    }
}
