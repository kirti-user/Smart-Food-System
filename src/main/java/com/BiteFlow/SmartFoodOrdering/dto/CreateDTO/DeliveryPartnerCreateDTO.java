package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DeliveryPartnerCreateDTO {
    @NotNull
    private Long userId;

    @NotBlank
    private String vehicleType;

    @NotBlank
    private String licenseNumber;
}
