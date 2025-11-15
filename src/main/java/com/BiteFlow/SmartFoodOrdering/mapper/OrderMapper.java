package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.OrderCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.OrderDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.OrderItemDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.DeliveryPartnerSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.OrderUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.enums.OrderStatus;
import com.BiteFlow.SmartFoodOrdering.model.Order;
import com.BiteFlow.SmartFoodOrdering.model.OrderItem;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class OrderMapper {

    public Order toEntity(OrderCreateDTO dto, List<OrderItem> items) {
        Order order = new Order();
        order.setTotalAmount(items.stream()
                .mapToDouble(OrderItem::getSubTotal)
                .sum());
        order.setStatus(OrderStatus.PENDING);
        order.setOrderDate(LocalDateTime.now());
        order.setDeliveryAddress(dto.getDeliveryAddress());
        order.setSpecialInstructions(dto.getSpecialInstructions());
        return order;
    }


    public void updateEntity(Order order, OrderUpdateDTO dto) {
        if (dto.getDeliveryAddress() != null) order.setDeliveryAddress(dto.getDeliveryAddress());
        if (dto.getSpecialInstructions() != null) order.setSpecialInstructions(dto.getSpecialInstructions());
        if (dto.getActualDeliveryTime() != null) order.setActualDeliveryTime(dto.getActualDeliveryTime());
    }

    public OrderDTO toResponse(
            Order entity,
            UserSummaryDTO user,
            RestaurantSummaryDTO restaurant,
            DeliveryPartnerSummaryDTO partner,
            List<OrderItemDTO> items) {

        OrderDTO dto = new OrderDTO();

        dto.setId(entity.getId());
        dto.setStatus(entity.getStatus());
        dto.setTotalAmount(entity.getTotalAmount());
        dto.setDeliveryAddress(entity.getDeliveryAddress());
        dto.setEstimatedDeliveryTime(entity.getEstimatedDeliveryTime());
        dto.setActualDeliveryTime(entity.getActualDeliveryTime());
        dto.setSpecialInstructions(entity.getSpecialInstructions());

        dto.setUser(user);
        dto.setRestaurant(restaurant);
        dto.setDeliveryPartner(partner);
        dto.setItems(items);

        return dto;
    }

    public OrderSummaryDTO toSummary(Order o) {
        return new OrderSummaryDTO(
                o.getId(),
                o.getTotalAmount(),
                o.getStatus(),
                o.getOrderDate()
        );
    }
}

