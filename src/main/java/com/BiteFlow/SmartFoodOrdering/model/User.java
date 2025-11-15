package com.BiteFlow.SmartFoodOrdering.model;

import com.BiteFlow.SmartFoodOrdering.enums.UserRole;
import com.BiteFlow.SmartFoodOrdering.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String phoneNumber;
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;


    private LocalDateTime joinDate = LocalDateTime.now();

    @OneToMany(mappedBy = "user",  orphanRemoval = true)
    private List<Order> orders;

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Payment> payments;

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Review> reviews;

    @OneToMany(mappedBy = "owner", orphanRemoval = true)
    private List<Restaurant> ownedRestaurants;

    private String profileImage;
}
