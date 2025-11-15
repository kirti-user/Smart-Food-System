package com.BiteFlow.SmartFoodOrdering.repository;

import com.BiteFlow.SmartFoodOrdering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
