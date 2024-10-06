package com.microservices.payment.model.mapper;

import com.microservices.payment.model.dto.PaymentDto;
import com.microservices.payment.model.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDto toDto(Payment entity);
    Payment toEntity(PaymentDto dto);
}
