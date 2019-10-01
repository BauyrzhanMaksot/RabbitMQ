package com.example.demo.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bauka on 01-Oct-19
 */
@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public Order readOrder(Long id) {
        return orderRepository.getOne(id);
    }

    public String createOrder(Order order) {
        orderRepository.save(order);
        return "success";
    }

    public String updateOrder(Order order) {
        orderRepository.save(order);
        return "success";
    }

    public String deleteOrder(Long id) {
        orderRepository.deleteById(id);
        return "success";
    }
}
