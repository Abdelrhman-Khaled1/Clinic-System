package com.microservices.doctor.proxy;

import com.microservices.doctor.model.dto.AddPaymentDto;
import com.microservices.doctor.model.dto.PaymentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentProxy {
    @GetMapping("/payment/payment-by-tran-id")
    public PaymentDto getPaymentByTranId(@RequestParam String tranId);

    @PostMapping("/payment/add-payment")
    public PaymentDto addPayment(@RequestBody AddPaymentDto dto);

}