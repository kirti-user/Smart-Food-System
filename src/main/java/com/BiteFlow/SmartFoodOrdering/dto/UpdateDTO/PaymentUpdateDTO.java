package com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO;

import com.BiteFlow.SmartFoodOrdering.enums.PaymentStatus;
import lombok.Data;

@Data
public class PaymentUpdateDTO {
    private PaymentStatus paymentStatus;

}
