package com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPartnerSummaryDTO {
    private Long id;
    private double rating;
    private boolean available;
}

