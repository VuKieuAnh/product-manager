package com.example.product.repository;

import com.example.product.model.Category;
import com.example.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Iterator;

public interface IProductRepository extends JpaRepository<Product, Long> {
    Iterable<Product> findAllByCategory(Category category);
}
