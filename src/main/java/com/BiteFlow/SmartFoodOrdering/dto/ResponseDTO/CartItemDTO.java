package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.MenuItemSummaryDTO;
import lombok.Data;

@Data
public class CartItemDTO {
    private Long id;
    private int quantity;
    private double priceAtAddTime;

    private MenuItemSummaryDTO menuItem;
}
