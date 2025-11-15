package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.CartCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.CartDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.CartItemDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.CartSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.CartUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.model.Cart;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartMapper {

    public Cart toEntity(CartCreateDTO dto) {
        Cart cart = new Cart();
        cart.setTotalAmount(0);
        return cart;
    }

    public void updateEntity(Cart cart, CartUpdateDTO dto) {
        cart.setTotalAmount(dto.getTotalAmount());
    }

    public CartDTO toResponse(
            Cart entity,
            UserSummaryDTO user,
            List<CartItemDTO> items) {

        CartDTO dto = new CartDTO();
        dto.setId(entity.getId());
        dto.setTotalAmount(entity.getTotalAmount());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setUpdatedAt(entity.getUpdatedAt());
        dto.setUser(user);
        dto.setCartItems(items);
        return dto;
    }

    public CartSummaryDTO toSummary(Cart c) {
        return new CartSummaryDTO(c.getId(), c.getTotalAmount());
    }
}

