package com.example.ecommerce.ecommerce.respository;

import com.example.ecommerce.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
