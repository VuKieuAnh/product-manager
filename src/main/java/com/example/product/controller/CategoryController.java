package com.example.product.controller;

import com.example.product.model.Category;
import com.example.product.model.Product;
import com.example.product.service.category.ICategoryService;
import com.example.product.service.product.IProductService;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IProductService productService;

    @GetMapping()
    public ResponseEntity<Iterable<Category>> getAllCategory(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK) ;
    }

    @PostMapping()
    public ResponseEntity<Category> createCategory(@RequestBody Category category){
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> editCategory(@PathVariable Long id, @RequestBody Category category){
        category.setId(id);
        categoryService.save(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Category> deleteProduct(@PathVariable Long id){
        categoryService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> detailProduct(@PathVariable Long id){
        return new ResponseEntity<>(categoryService.findById(id).get(), HttpStatus.OK);
    }


    @GetMapping("/{id}/products")
    public ResponseEntity<Iterable<Product>> findAllProductByCategory(@PathVariable Long id){
        Optional<Category> category = categoryService.findById(id);
        if (!category.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productService.findAllByCategory(category.get()), HttpStatus.OK);
    }
}
