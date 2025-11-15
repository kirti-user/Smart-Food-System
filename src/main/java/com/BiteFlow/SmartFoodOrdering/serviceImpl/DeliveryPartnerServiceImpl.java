package com.BiteFlow.SmartFoodOrdering.serviceImpl;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.DeliveryPartnerCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.DeliveryPartnerDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.DeliveryPartnerUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.mapper.DeliveryPartnerMapper;
import com.BiteFlow.SmartFoodOrdering.model.DeliveryPartner;
import com.BiteFlow.SmartFoodOrdering.repository.DeliveryPartnerRepository;
import com.BiteFlow.SmartFoodOrdering.service.DeliveryPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DeliveryPartnerServiceImpl implements DeliveryPartnerService {

    private final DeliveryPartnerMapper deliveryPartnerMapper;
    private final DeliveryPartnerRepository deliveryPartnerRepository;

    @Autowired
    public DeliveryPartnerServiceImpl(DeliveryPartnerMapper deliveryPartnerMapper, DeliveryPartnerRepository deliveryPartnerRepository) {
        this.deliveryPartnerMapper = deliveryPartnerMapper;
        this.deliveryPartnerRepository = deliveryPartnerRepository;
    }

    public DeliveryPartnerDTO registerPartner(DeliveryPartnerCreateDTO deliveryPartnerCreateDTO) {
        DeliveryPartner partner = deliveryPartnerMapper.toEntity(deliveryPartnerCreateDTO);
        deliveryPartnerRepository.save(partner);
        return deliveryPartnerMapper.toResponse(partner, new UserSummaryDTO(), new ArrayList<>());
    }

    public void updatePartner(Long partnerId, DeliveryPartnerUpdateDTO deliveryPartnerUpdateDTO) {
        DeliveryPartner partner = deli
    }
}
