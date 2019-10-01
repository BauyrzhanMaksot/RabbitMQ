package com.example.demo;

import com.example.demo.Order.Order;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Bauka on 01-Oct-19
 */
@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("")
    private String exchange;

    @Value("")
    private String routingkey;

    public void send(Order order) {
        rabbitTemplate.convertAndSend(exchange, routingkey, order);
        System.out.println("Send msg = " + order);

    }
}