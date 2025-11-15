package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReviewDTO {
    private Long id;
    private int rating;
    private String comment;
    private LocalDateTime createdAt;

    private UserSummaryDTO user;
    private RestaurantSummaryDTO restaurant;
    private OrderSummaryDTO order;
}
