package com.example.cloneproject.service;

import com.example.cloneproject.model.Email;
import com.example.cloneproject.model.Order;
import com.example.cloneproject.model.OrderItem;

import java.util.List;

public interface OrderService {
    Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems);
}
