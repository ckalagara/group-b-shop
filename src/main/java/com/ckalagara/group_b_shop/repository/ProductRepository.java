package com.ckalagara.group_b_shop.repository;

import com.ckalagara.group_b_shop.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{name:'?0'}")
    Product GetProductByName(String name);

    @Query(value="{category:'?0'}")
    List<Product> getProductsByCategory(String category);

    public long count();
}
