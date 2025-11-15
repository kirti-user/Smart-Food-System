package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.enums.DeliveryStatus;
import lombok.Data;

import java.util.List;

@Data
public class DeliveryPartnerDTO {
    private Long id;
    private String vehicleType;
    private String licenseNumber;
    private DeliveryStatus currentStatus;
    private boolean available;
    private double rating;

    private UserSummaryDTO user;
    private List<OrderSummaryDTO> assignedOrders;
}
