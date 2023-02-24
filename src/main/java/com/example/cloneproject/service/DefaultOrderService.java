package com.example.cloneproject.service;

import com.example.cloneproject.model.Email;
import com.example.cloneproject.model.Order;
import com.example.cloneproject.model.OrderItem;
import com.example.cloneproject.model.OrderStatus;
import com.example.cloneproject.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DefaultOrderService implements OrderService {

    private final OrderRepository orderRepository;
    @Override
    public Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems) {
        Order order=  new Order(UUID.randomUUID(), email, address, postcode, orderItems, OrderStatus.ACCEPTED, LocalDateTime.now(), LocalDateTime.now());
        return orderRepository.insert(order);
    }
}
