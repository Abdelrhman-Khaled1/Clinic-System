package com.microservices.payment.service;

import com.microservices.payment.model.dto.AddPaymentDto;
import com.microservices.payment.model.dto.PaymentDto;
import com.microservices.payment.model.entity.Payment;
import com.microservices.payment.model.mapper.PaymentMapper;
import com.microservices.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentMapper paymentMapper;

    public PaymentDto getPayment(String tranId) {
        Optional<Payment> payment = paymentRepository.findByTranId(tranId);
        return paymentMapper.toDto(payment.get());
    }

    public PaymentDto addPayment(AddPaymentDto dto) {

        String tranId = UUID.randomUUID().toString();
        PaymentDto paymentDto = PaymentDto.builder()
                .amount(dto.getAmount())
                .patientId(dto.getPatientId())
                .tranId(tranId)
                .build();

        Payment payment = paymentMapper.toEntity(paymentDto);
        Payment savedPayment = paymentRepository.save(payment);
        return paymentMapper.toDto(savedPayment);
    }

    public List<PaymentDto> getPatientPayments(Long patientId){
        List<Payment> patientPayments = paymentRepository.findAllByPatientId(patientId);
        return paymentMapper.toDtos(patientPayments);
    }
}

