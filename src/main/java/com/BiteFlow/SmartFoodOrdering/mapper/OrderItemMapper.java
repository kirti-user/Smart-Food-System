package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.OrderItemCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.OrderItemDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.MenuItemSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderItemSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.OrderItemUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.model.OrderItem;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapper {

    public OrderItem toEntity(OrderItemCreateDTO dto) {
        OrderItem item = new OrderItem();
        item.setQuantity(dto.getQuantity());
        return item;
    }

    public void updateEntity(OrderItem item, OrderItemUpdateDTO dto) {
        item.setQuantity(dto.getQuantity());
    }

    public OrderItemDTO toResponse(OrderItem item, MenuItemSummaryDTO menuItem) {
        OrderItemDTO dto = new OrderItemDTO();
        dto.setId(item.getId());
        dto.setQuantity(item.getQuantity());
        dto.setPriceAtPurchase(item.getPriceAtPurchase());
        dto.setSubTotal(item.getSubTotal());
        dto.setMenuItem(menuItem);
        return dto;
    }

    public OrderItemSummaryDTO toSummary(OrderItem item) {
        return new OrderItemSummaryDTO(
                item.getId(),
                item.getQuantity(),
                item.getSubTotal()
        );
    }
}

