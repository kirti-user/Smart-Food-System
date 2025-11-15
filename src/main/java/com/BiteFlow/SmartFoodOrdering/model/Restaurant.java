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
