package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.MenuItemSummaryDTO;
import lombok.Data;

@Data
public class OrderItemDTO {

    private Long id;
    private double priceAtPurchase;
    private int quantity;
    private double subTotal;

    private MenuItemSummaryDTO menuItem;

}
