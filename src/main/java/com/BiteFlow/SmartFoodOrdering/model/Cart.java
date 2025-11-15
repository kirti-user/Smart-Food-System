package com.BiteFlow.SmartFoodOrdering.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "carts")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart {

    // REVIEW REQUEST:
// Act as a code reviewer for this entity class. Please check for:
// 1. Logical flaws or potential bugs
// 2. Security risks (e.g., sensitive fields, password handling)
// 3. Performance or maintainability issues
// 4. Proper use of annotations and relationships
// For each issue, explain:
// - Why it is a problem
// - How to fix it
// - Provide corrected code or best practices example


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

//    private Restaurant restaurant;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> cartItems;

    private double totalAmount;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}
