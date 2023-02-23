package com.example.cloneproject.dto;

import com.example.cloneproject.model.Category;

public record CreateProductRequest(String productName, Category category, long price, String description) {
}
