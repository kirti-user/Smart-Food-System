package com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantSummaryDTO {
    private Long id;
    private String name;
    private String category;
    private double rating;
}
