package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.CartItemCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.CartItemDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.CartItemSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.MenuItemSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.CartItemUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.model.CartItem;
import com.BiteFlow.SmartFoodOrdering.model.MenuItem;
import org.springframework.stereotype.Component;

@Component
public class CartItemMapper {

    public CartItem toEntity(CartItemCreateDTO dto, MenuItem menuItem) {
        CartItem item = new CartItem();
        item.setQuantity(dto.getQuantity());
        item.setPriceAtAddTime(menuItem.getPrice()); // snapshot
        item.setMenuItem(menuItem);
        return item;
    }


    public void updateEntity(CartItem item, CartItemUpdateDTO dto) {
        int quantity = dto.getQuantity();
        if (quantity > 0 && quantity <= item.getMenuItem().getStock()) {
            item.setQuantity(quantity);
        } else {
            throw new IllegalArgumentException("Invalid quantity");
        }
    }


    public CartItemDTO toResponse(CartItem item, MenuItemSummaryDTO menuItem) {
        CartItemDTO dto = new CartItemDTO();
        dto.setId(item.getId());
        dto.setQuantity(item.getQuantity());
        dto.setPriceAtAddTime(item.getPriceAtAddTime());
        dto.setMenuItem(menuItem);
        return dto;
    }

    public CartItemSummaryDTO toSummary(CartItem item) {
        return new CartItemSummaryDTO(
                item.getId(),
                item.getQuantity(),
                item.getPriceAtAddTime()
        );
    }
}
