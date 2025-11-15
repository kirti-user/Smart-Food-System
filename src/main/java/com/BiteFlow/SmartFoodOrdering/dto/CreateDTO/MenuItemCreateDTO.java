package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MenuItemCreateDTO {

    @NotNull
    private Long restaurantId;

    @NotBlank
    private String name;
    private String description;

    @NotNull
    private Double price;
    private Double discountedPrice;
    private String category;
    private boolean veg;
    private Integer calories;
    private String imageURL;
}
