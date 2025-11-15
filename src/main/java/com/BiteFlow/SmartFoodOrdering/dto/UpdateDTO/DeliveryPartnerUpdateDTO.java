package com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO;

import com.BiteFlow.SmartFoodOrdering.enums.DeliveryStatus;
import lombok.Data;

@Data
public class DeliveryPartnerUpdateDTO {
    private String vehicleType ;
    private String licenseNumber;
    private DeliveryStatus currentStatus;
    private boolean available;
    private double rating;
}
