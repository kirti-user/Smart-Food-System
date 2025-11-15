package com.BiteFlow.SmartFoodOrdering.repository;

import com.BiteFlow.SmartFoodOrdering.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
