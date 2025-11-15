package com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO;

import com.BiteFlow.SmartFoodOrdering.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderSummaryDTO {
    private Long id;
    private Double totalAmount;
    private OrderStatus status;
    private LocalDateTime orderDate;
}
