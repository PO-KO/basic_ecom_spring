package com.dano.basic_ecom.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dano.basic_ecom.models.Product;
import com.dano.basic_ecom.services.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

    ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // Routes
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @PostMapping("/products/add")
    public String addProduct(@RequestBody Product product) {
        service.addProduct(product);
        return "Added successfully";
    }
}
