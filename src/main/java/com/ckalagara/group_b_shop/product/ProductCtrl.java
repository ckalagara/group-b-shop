package com.ckalagara.group_b_shop.product;

import com.ckalagara.group_b_shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductCtrl {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/api/v1/products")
    public List<Product> GetProducts() {
        return  productRepository.findAll();
    }

    @PostMapping("/api/v1/products")
    public Product PutProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

}

