package com.microservices.doctor.controller;

import com.microservices.doctor.model.dto.AddPatientDto;
import com.microservices.doctor.model.dto.PatientDto;
import com.microservices.doctor.model.dto.UpdatePatientDto;
import com.microservices.doctor.service.DoctorPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//context-path: /doctor
public class DoctorPatientController {
    @Autowired
    private DoctorPatientService patientService;

    @GetMapping("/get-patient")
    public PatientDto getPatient(@RequestParam Long id){
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
}
