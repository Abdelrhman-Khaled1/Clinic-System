package com.microservices.patient.service;


import com.microservices.patient.model.dto.PaymentDto;
import com.microservices.patient.proxy.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PaymentService {

    @Autowired
    private PaymentProxy paymentProxy;
    public List<PaymentDto> getPatientPayments(Long patientId) {
        return paymentProxy.getPatientPayments(patientId);
    }
}
