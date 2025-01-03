package com.dano.basic_ecom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dano.basic_ecom.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
