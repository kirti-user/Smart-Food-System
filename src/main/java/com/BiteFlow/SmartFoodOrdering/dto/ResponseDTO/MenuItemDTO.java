package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.enums.MenuItemsStatus;
import lombok.Data;

@Data
public class MenuItemDTO {
    private Long id;
    private Long restaurantId;
    private String name;
    private String description;
    private Double price;
    private Double discountedPrice;
    private String category;
    private boolean veg;
    private Integer calories;
    private String imageURL;
    private boolean available;
    private MenuItemsStatus status;
    private Double rating;

    private RestaurantSummaryDTO restaurant;
}
