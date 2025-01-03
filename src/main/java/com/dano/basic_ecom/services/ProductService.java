package com.dano.basic_ecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dano.basic_ecom.models.Product;
import com.dano.basic_ecom.repos.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public void addProduct(Product product) {
        repo.save(product);
    }
}
