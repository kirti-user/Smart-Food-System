package com.BiteFlow.SmartFoodOrdering.repository;

import com.BiteFlow.SmartFoodOrdering.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
