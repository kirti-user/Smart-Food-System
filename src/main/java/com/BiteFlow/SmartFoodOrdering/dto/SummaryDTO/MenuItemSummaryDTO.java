package com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuItemSummaryDTO {
    private Long id;
    private String name;
    private Double price;
    private boolean available;
}
