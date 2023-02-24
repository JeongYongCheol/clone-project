package com.example.cloneproject.dto;

import com.example.cloneproject.model.OrderItem;

import java.util.List;

public record CreateOrderRequest(
        String email, String address, String postcode, List<OrderItem> orderItems) {
}
