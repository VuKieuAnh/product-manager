package com.example.product.service.product;

import com.example.product.model.Category;
import com.example.product.model.Product;
import com.example.product.service.GeneralService;

import java.util.Iterator;

public interface IProductService extends GeneralService<Product> {
    Iterable<Product> findAllByCategory(Category category);
}
