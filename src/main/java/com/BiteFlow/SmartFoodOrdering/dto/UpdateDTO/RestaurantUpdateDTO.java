package com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO;

import com.BiteFlow.SmartFoodOrdering.enums.RestaurantStatus;
import lombok.Data;

import java.time.LocalTime;

@Data
public class RestaurantUpdateDTO {

    private String name;
    private String description;
    private String address;
    private String contactNumber;
    private LocalTime openTime;
    private LocalTime closeTime;
    private RestaurantStatus status;
    private String category;
    private String imageURL;

}
