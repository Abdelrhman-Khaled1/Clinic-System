package com.microservices.doctor.service;

import com.microservices.doctor.model.dto.AddPaymentDto;
import com.microservices.doctor.model.dto.PaymentDto;
import com.microservices.doctor.proxy.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientPaymentService {

    @Autowired
    private PaymentProxy paymentProxy;


    public PaymentDto getPayment(String tranId) {
        return paymentProxy.getPaymentByTranId(tranId);
    }

    public PaymentDto addPayment(AddPaymentDto dto) {
        return paymentProxy.addPayment(dto);
    }
}
