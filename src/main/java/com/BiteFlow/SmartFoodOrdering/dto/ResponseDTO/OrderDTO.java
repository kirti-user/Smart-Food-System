package com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO;

import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.DeliveryPartnerSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.enums.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {

    private Long id;
    private OrderStatus status;
    private double totalAmount;
    private String deliveryAddress;
    private LocalDateTime estimatedDeliveryTime;
    private LocalDateTime actualDeliveryTime;
    private String specialInstructions;

    private UserSummaryDTO user;
    private RestaurantSummaryDTO restaurant;
    private DeliveryPartnerSummaryDTO deliveryPartner;
    private List<OrderItemDTO> items;



}
