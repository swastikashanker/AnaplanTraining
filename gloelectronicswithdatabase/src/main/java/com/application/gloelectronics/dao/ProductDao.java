package com.application.gloelectronics.dao;

import com.application.gloelectronics.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
//    List<Product> getListOfProducts();
}
