package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.PaymentCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.PaymentDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.PaymentSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.PaymentUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.enums.PaymentStatus;
import com.BiteFlow.SmartFoodOrdering.model.Payment;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PaymentMapper {

    public Payment toEntity(PaymentCreateDTO dto) {
        Payment p = new Payment();
        p.setAmount(dto.getAmount());
        p.setPaymentMethod(dto.getPaymentMethod());
        p.setTransactionId(dto.getTransactionId());
        p.setTimestamp(LocalDateTime.now());
        p.setPaymentStatus(PaymentStatus.PENDING);
        return p;
    }

    public void updateEntity(Payment payment, PaymentUpdateDTO dto) {
        if (dto.getPaymentStatus() != null)
            payment.setPaymentStatus(dto.getPaymentStatus());
    }

    public PaymentDTO toResponse(
            Payment p,
            UserSummaryDTO user,
            OrderSummaryDTO order) {

        PaymentDTO dto = new PaymentDTO();
        dto.setId(p.getId());
        dto.setAmount(p.getAmount());
        dto.setPaymentMethod(p.getPaymentMethod());
        dto.setPaymentStatus(p.getPaymentStatus());
        dto.setTransactionId(p.getTransactionId());
        dto.setTimestamp(p.getTimestamp());
        dto.setUser(user);
        dto.setOrder(order);

        return dto;
    }

    public PaymentSummaryDTO toSummary(Payment p) {
        return new PaymentSummaryDTO(
                p.getId(),
                p.getAmount(),
                p.getPaymentStatus()
        );
    }
}

