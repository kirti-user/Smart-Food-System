package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.enums.UserRole;
import com.BiteFlow.SmartFoodOrdering.enums.UserStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class UserDTO {

    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
    private UserRole role;
    private UserStatus status;
    private LocalDateTime joinDate;
    private String profileImage;

    private List<OrderSummaryDTO> orders;
    private List<RestaurantSummaryDTO> ownedRestaurants;
}
