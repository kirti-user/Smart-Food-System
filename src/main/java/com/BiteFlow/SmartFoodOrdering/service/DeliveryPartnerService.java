package com.BiteFlow.SmartFoodOrdering.service;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.DeliveryPartnerCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.DeliveryPartnerDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.DeliveryPartnerUpdateDTO;

public interface DeliveryPartnerService {
    DeliveryPartnerDTO registerPartner(DeliveryPartnerCreateDTO deliveryPartnerCreateDTO);
    void updatePartner(Long partnerId, DeliveryPartnerUpdateDTO deliveryPartnerUpdateDTO);
    DeliveryPartnerDTO getPartnerById(Long partnerId);
    void deletePartner(Long partnerId);
}
