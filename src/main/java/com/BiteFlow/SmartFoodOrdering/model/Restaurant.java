package com.BiteFlow.SmartFoodOrdering.model;

import com.BiteFlow.SmartFoodOrdering.enums.RestaurantStatus;
import com.BiteFlow.SmartFoodOrdering.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "restaurants")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {
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

    private String name;

    private String description;
    private String address;
    private String contactNumber;
    private LocalTime openTime;
    private LocalTime closeTime;
    private double rating;

    @Enumerated(EnumType.STRING)
    private RestaurantStatus status;

   @ManyToOne
   @JoinColumn(name = "owner_id")
    private User owner;

   @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<MenuItem> menuItems;

   @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL,orphanRemoval = true)
   private List<Order> orders;

    private String imageURL;

    private String category;
}
