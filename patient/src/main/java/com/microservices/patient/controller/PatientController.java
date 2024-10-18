package com.microservices.patient.controller;

import com.microservices.patient.model.dto.AddPatientDto;
import com.microservices.patient.model.dto.PatientDto;
import com.microservices.patient.model.dto.PaymentDto;
import com.microservices.patient.model.dto.UpdatePatientDto;
import com.microservices.patient.service.PatientService;
import com.microservices.patient.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PatientController {//context-path: /patient
    @Autowired
    private PatientService patientService;
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add-patient")
    public PatientDto save(@RequestBody AddPatientDto dto) {
        return patientService.save(dto);
    }

    @PutMapping("/update-patient")
    public PatientDto update(@RequestBody UpdatePatientDto dto) {
        return patientService.update(dto);
    }

    @DeleteMapping("/delete-patient")
    public void delete(@RequestParam Long id) {
        patientService.delete(id);
    }

    @GetMapping("/get-patient")
    public PatientDto get(@RequestParam Long id) {
        return patientService.get(id);
    }

    @GetMapping("/get-patient-payments")
    public List<PaymentDto> getPatientPayments(@RequestHeader Long patientId){
        return paymentService.getPatientPayments(patientId);
    }

}
