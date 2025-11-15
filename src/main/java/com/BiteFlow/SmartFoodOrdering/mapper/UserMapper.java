package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.UserCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.UserDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.UserUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.enums.UserStatus;
import com.BiteFlow.SmartFoodOrdering.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {

    public User toEntity(UserCreateDTO dto) {
        User user = new User();
        user.setFullName(dto.getFullName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setAddress(dto.getAddress());
        user.setRole(dto.getRole());
        user.setStatus(UserStatus.ACTIVE);
        return user;
    }

    public void updateEntity(User user, UserUpdateDTO dto) {
        if (dto.getFullName() != null) user.setFullName(dto.getFullName());
        if (dto.getPhoneNumber() != null) user.setPhoneNumber(dto.getPhoneNumber());
        if (dto.getAddress() != null) user.setAddress(dto.getAddress());
        if (dto.getStatus() != null) user.setStatus(dto.getStatus());
        if (dto.getProfileImage() != null) user.setProfileImage(dto.getProfileImage());
    }

    public UserDTO toResponse(User user,
                              List<OrderSummaryDTO> orders,
                              List<RestaurantSummaryDTO> ownedRestaurants) {

        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setFullName(user.getFullName());
        dto.setEmail(user.getEmail());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setAddress(user.getAddress());
        dto.setRole(user.getRole());
        dto.setStatus(user.getStatus());
        dto.setJoinDate(user.getJoinDate());
        dto.setProfileImage(user.getProfileImage());
        dto.setOrders(orders != null ? orders : new ArrayList<>());
        dto.setOwnedRestaurants(ownedRestaurants != null ? ownedRestaurants : new ArrayList<>());

        return dto;
    }

    public UserSummaryDTO toSummary(User user) {
        return new UserSummaryDTO(
                user.getId(),
                user.getFullName(),
                user.getEmail(),
                user.getRole()
        );
    }
}

