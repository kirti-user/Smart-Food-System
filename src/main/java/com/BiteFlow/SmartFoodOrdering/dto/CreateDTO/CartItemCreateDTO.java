package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CartItemCreateDTO {
    @NotNull
    private Long menuItemId;

    @Min(1)
    private int quantity;
}
