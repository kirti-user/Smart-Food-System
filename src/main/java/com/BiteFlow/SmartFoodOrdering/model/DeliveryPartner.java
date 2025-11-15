package com.BiteFlow.SmartFoodOrdering.model;

import com.BiteFlow.SmartFoodOrdering.enums.DeliveryStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "delivery_partners")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryPartner {
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
    @JoinColumn(name = "user_id",unique = true)
    private User user;

    private String vehicleType;

    private String licenseNumber;

    private DeliveryStatus currentStatus;

    private boolean available;

    private double rating;

    @OneToMany(mappedBy = "deliveryPartner",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> assignedOrders;
}
