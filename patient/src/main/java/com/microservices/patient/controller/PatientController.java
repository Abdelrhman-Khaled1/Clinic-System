package com.microservices.patient.controller;

import com.microservices.patient.model.dto.AddPatientDto;
import com.microservices.patient.model.dto.PatientDto;
import com.microservices.patient.model.dto.UpdatePatientDto;
import com.microservices.patient.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/add-patient")
    public PatientDto save(@RequestBody AddPatientDto dto) {
        return patientService.save(dto);
    }

    @PutMapping("/update-patient")
    public PatientDto update(@RequestBody UpdatePatientDto dto) {
        return patientService.update(dto);
    }

    @DeleteMapping("/delete-patient")
    public void update(@RequestParam Long id) {
        patientService.delete(id);
    }

    @GetMapping("/get-patient")
    public PatientDto save(@RequestParam Long id) {
        return patientService.get(id);
    }

}
