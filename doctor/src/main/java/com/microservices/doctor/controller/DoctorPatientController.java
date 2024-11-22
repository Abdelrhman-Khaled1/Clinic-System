package com.microservices.doctor.controller;

import com.microservices.doctor.model.dto.AddPatientDto;
import com.microservices.doctor.model.dto.PatientDto;
import com.microservices.doctor.model.dto.UpdatePatientDto;
import com.microservices.doctor.service.DoctorPatientService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//context-path: /doctor
@Slf4j
public class DoctorPatientController {
    @Autowired
    private DoctorPatientService patientService;

    @CircuitBreaker(name = "getPatientInstance",fallbackMethod = "getDefaultPatient")
    @GetMapping("/get-patient")
    public PatientDto getPatient(@RequestParam Long id){
        log.info("getting patient details for id {}",id);
        return this.patientService.getPatient(id);
    }

    @PostMapping("/add-patient")
    public PatientDto save(@RequestBody AddPatientDto dto) {
        return patientService.savePatient(dto);
    }

    @PutMapping("/update-patient")
    public PatientDto update(@RequestBody UpdatePatientDto dto) {
        return patientService.updatePatient(dto);
    }

    @DeleteMapping("/delete-patient")
    public void delete(@RequestParam Long id) {
        patientService.deletePatient(id);
    }

    public PatientDto getDefaultPatient(Exception e){
        return PatientDto.builder()
                .patientName("UNKNOWN-PATIENT")
                .id(0L)
                .patientAge(0)
                .build();
    }
}
