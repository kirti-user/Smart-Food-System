package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class CartCreateDTO {
    @NotNull
    private Long userId;

    @NotEmpty
    private List<CartItemCreateDTO> items;
}
