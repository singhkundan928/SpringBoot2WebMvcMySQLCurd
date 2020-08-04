package com.kundan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kundan.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
