package com.example.cloneproject.model;

import lombok.Getter;

import java.util.UUID;

public record OrderItem(UUID productId, Category category, long price, int quantity) {
}
