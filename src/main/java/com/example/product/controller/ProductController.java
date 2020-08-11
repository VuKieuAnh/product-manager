package com.example.product.controller;


import com.example.product.model.Product;
import com.example.product.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping()
    public ResponseEntity<Iterable<Product>> getAllProduct(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK) ;
    }

    @PostMapping()
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.save(product), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> editProduct(@PathVariable Long id, @RequestBody Product product){
        product.setId(id);
        productService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id){
        productService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> detailProduct(@PathVariable Long id){
        return new ResponseEntity<>(productService.findById(id).get(), HttpStatus.OK);
    }



}
