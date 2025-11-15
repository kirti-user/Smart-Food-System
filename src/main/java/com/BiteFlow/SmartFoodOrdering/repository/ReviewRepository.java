package com.BiteFlow.SmartFoodOrdering.repository;

import com.BiteFlow.SmartFoodOrdering.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
