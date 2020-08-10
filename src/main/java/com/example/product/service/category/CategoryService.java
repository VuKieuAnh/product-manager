package com.example.product.service.category;

import com.example.product.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryService categoryService;

    @Override
    public Iterable<Category> findAll() {
        return categoryService.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryService.findById(id);
    }

    @Override
    public Category save(Category category) {
        return categoryService.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryService.remove(id);
    }
}
