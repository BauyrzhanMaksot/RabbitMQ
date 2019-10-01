package com.example.demo.Order;

import com.example.demo.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bauka on 01-Oct-19
 */
@RestController
public class OrderController {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @Autowired
    OrderService orderService;

    @GetMapping("getOrder/{getid}")
    public Order readOrder(Long id) {
        return orderService.readOrder(id);
    }

    @PostMapping("createOrder")
    public String createOrder(Order order) {
        rabbitMQSender.send(order);
        return orderService.createOrder(order);
    }

    @DeleteMapping("deleteOrder")
    public String deleteOrder(Long id) {
        return orderService.deleteOrder(id);
    }

    @PostMapping("updateOrder")
    public String updateOrder(Order order) {
        return orderService.updateOrder(order);
    }
}
