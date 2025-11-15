package com.BiteFlow.SmartFoodOrdering.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_items")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
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

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItem menuItem;

    private int quantity;
    private double priceAtPurchase;
    private double subTotal;

}
