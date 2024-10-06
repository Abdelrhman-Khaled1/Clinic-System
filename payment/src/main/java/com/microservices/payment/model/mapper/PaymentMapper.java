package com.microservices.payment.model.mapper;

import com.microservices.payment.model.dto.PaymentDto;
import com.microservices.payment.model.entity.Payment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDto toDto(Payment entity);
    Payment toEntity(PaymentDto dto);
    List<PaymentDto> toDtos(List<Payment> entities);
    List<Payment> toEntities(List<PaymentDto> dtos);
}
