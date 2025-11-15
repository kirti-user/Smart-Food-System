package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.DeliveryPartnerCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.DeliveryPartnerDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.DeliveryPartnerSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.DeliveryPartnerUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.enums.DeliveryStatus;
import com.BiteFlow.SmartFoodOrdering.model.DeliveryPartner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeliveryPartnerMapper {

    public DeliveryPartner toEntity(DeliveryPartnerCreateDTO dto) {
        DeliveryPartner dp = new DeliveryPartner();
        dp.setVehicleType(dto.getVehicleType());
        dp.setLicenseNumber(dto.getLicenseNumber());
        dp.setAvailable(true);
        dp.setCurrentStatus(DeliveryStatus.IDLE);
        dp.setRating(0.0);
        return dp;
    }

    public void updateEntity(DeliveryPartner dp, DeliveryPartnerUpdateDTO dto) {
        if (dto.getVehicleType() != null) dp.setVehicleType(dto.getVehicleType());
        if (dto.getLicenseNumber() != null) dp.setLicenseNumber(dto.getLicenseNumber());
        if (dto.getCurrentStatus() != null) dp.setCurrentStatus(dto.getCurrentStatus());
        dp.setAvailable(dto.isAvailable());
    }

    public DeliveryPartnerDTO toResponse(
            DeliveryPartner dp,
            UserSummaryDTO user,
            List<OrderSummaryDTO> orders) {

        DeliveryPartnerDTO dto = new DeliveryPartnerDTO();
        dto.setId(dp.getId());
        dto.setVehicleType(dp.getVehicleType());
        dto.setLicenseNumber(dp.getLicenseNumber());
        dto.setCurrentStatus(dp.getCurrentStatus());
        dto.setAvailable(dp.isAvailable());
        dto.setRating(dp.getRating());
        dto.setUser(user);
        dto.setAssignedOrders(orders);

        return dto;
    }

    public DeliveryPartnerSummaryDTO toSummary(DeliveryPartner dp) {
        return new DeliveryPartnerSummaryDTO(
                dp.getId(),
                dp.getRating(),
                dp.isAvailable()
        );
    }
}

