package com.example.demo.Order;

import com.example.demo.Order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bauka on 01-Oct-19
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
