package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalTime;

@Data
public class RestaurantCreateDTO {

    @NotBlank
    private String name;
    private String description;
    private String address;
    private String contactNumber;
    private LocalTime openTime;
    private LocalTime closeTime;
    private String category;
    private String imageURL;
}
