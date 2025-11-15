package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.MenuItemSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.enums.RestaurantStatus;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class RestaurantDTO {

    private Long id;
    private String name;
    private String description;
    private String address;
    private String contactNumber;
    private LocalTime openTime;
    private LocalTime closeTime;
    private double rating;
    private RestaurantStatus status;
    private Long ownerId;
    private String category;
    private String imageURL;

    private UserSummaryDTO owner;
    private List<MenuItemSummaryDTO> menuItems;


}
