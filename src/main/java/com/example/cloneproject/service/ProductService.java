package com.example.cloneproject.service;

import com.example.cloneproject.model.Category;
import com.example.cloneproject.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getProductsByCategory(Category category);
    List<Product> getAllProducts();
    Product createProduct(String productName, Category category, long price);
    Product createProduct(String productName, Category category, long price, String description);


}
