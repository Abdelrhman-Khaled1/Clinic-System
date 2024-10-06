package com.microservices.payment.controller;

import com.microservices.payment.model.dto.AddPaymentDto;
import com.microservices.payment.model.dto.PaymentDto;
import com.microservices.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment-by-tran-id")
    public PaymentDto getPaymentByTranId(@RequestParam String tranId){
        return paymentService.getPayment(tranId);
    }

    @PostMapping("/add-payment")
    public PaymentDto addPayment(@RequestBody AddPaymentDto dto){
        return paymentService.addPayment(dto);
    }

}

