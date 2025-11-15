package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderCreateDTO {

    @NotNull
    private Long userId;

    @NotNull
    private Long restaurantId;

    @NotBlank
    private String deliveryAddress;

    private String specialInstructions;

    private Double totalAmount;


}
