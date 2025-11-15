package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class ReviewCreateDTO {
    @NotNull
    private Long userId;

    @NotNull
    private Long restaurantId;

    private Long orderId; // optional, can be null

    @Min(1)
    @Max(5)
    private int rating;

    private String comment;
}
