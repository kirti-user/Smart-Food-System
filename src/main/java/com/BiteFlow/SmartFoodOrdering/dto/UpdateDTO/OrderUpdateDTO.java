package com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO;

import com.BiteFlow.SmartFoodOrdering.enums.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderUpdateDTO {
    private OrderStatus status;
    private String deliveryAddress;
    private String specialInstructions;
    private LocalDateTime actualDeliveryTime;
}
