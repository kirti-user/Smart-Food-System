package com.BiteFlow.SmartFoodOrdering.repository;

import com.BiteFlow.SmartFoodOrdering.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
