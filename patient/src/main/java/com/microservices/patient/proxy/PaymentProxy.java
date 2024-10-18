package com.microservices.patient.proxy;

import com.microservices.patient.model.dto.PaymentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "PAYMENT-SERVICE", path = "/payment")
public interface PaymentProxy {
    @GetMapping("/get-patient-payments")
    public List<PaymentDto> getPatientPayments(@RequestHeader Long patientId);
}
