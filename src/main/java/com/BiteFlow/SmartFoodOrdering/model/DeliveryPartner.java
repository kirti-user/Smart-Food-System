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
