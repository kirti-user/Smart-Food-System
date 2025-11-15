package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CartDTO {
    private Long id;
    private Long userId;
    private List<CartItemDTO> cartItems;
    private double totalAmount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private UserSummaryDTO user;
}
