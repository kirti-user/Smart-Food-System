package com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO;

import com.BiteFlow.SmartFoodOrdering.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentSummaryDTO {
    private Long id;
    private double amount;
    private PaymentStatus paymentStatus;
}
