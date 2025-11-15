package com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemSummaryDTO {
    private Long id;
    private int quantity;
    private double priceAtAddTime;
}
