package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import com.BiteFlow.SmartFoodOrdering.enums.PaymentMethod;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PaymentCreateDTO {
    @NotNull
    private Long orderId;

    @NotNull
    private Long userId;

    @NotNull
    private double amount;

    @NotNull
    private PaymentMethod paymentMethod;
    private String transactionId;
}
