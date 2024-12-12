package com.keltiga.model.repos;

import com.keltiga.model.entities.Product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository <Product, Long>{
    
    List<Product> findByNameContains(String name);
}
