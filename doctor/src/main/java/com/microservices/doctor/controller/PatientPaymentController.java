package com.microservices.doctor.controller;

import com.microservices.doctor.model.dto.AddPaymentDto;
import com.microservices.doctor.model.dto.PaymentDto;
import com.microservices.doctor.service.PatientPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment") //context-path: /doctor
public class PatientPaymentController {
    @Autowired
    private PatientPaymentService paymentService;

    @GetMapping("/payment-by-tran-id")
    public PaymentDto getPaymentByTranId(@RequestParam String tranId){
        return paymentService.getPayment(tranId);
    }

    @PostMapping("/add-payment")
    public PaymentDto addPayment(@RequestBody AddPaymentDto dto){
        return paymentService.addPayment(dto);
    }


}
