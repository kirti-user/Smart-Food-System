package com.BiteFlow.SmartFoodOrdering.model;

import com.BiteFlow.SmartFoodOrdering.enums.MenuItemsStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "menu_items")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuItem {
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
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;

    private String name;
    private String description;
    private Double price;
    private Double discountedPrice;
    private String category;
    private boolean veg;
    private Integer calories;
    private String imageURL;
    private boolean available;

    @Enumerated(EnumType.STRING)
    private MenuItemsStatus status;

    @OneToMany(mappedBy = "menuItem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;

    private Double rating;
}
