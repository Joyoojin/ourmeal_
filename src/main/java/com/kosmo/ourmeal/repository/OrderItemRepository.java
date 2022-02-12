package com.kosmo.ourmeal.repository;

import com.kosmo.ourmeal.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}