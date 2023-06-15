package com.application.gloelectronics.dao;

import com.application.gloelectronics.dto.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getListOfProducts();
}
