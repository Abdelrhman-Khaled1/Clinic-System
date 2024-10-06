package com.microservices.doctor.proxy;

import com.microservices.doctor.model.dto.AddPatientDto;
import com.microservices.doctor.model.dto.PatientDto;
import com.microservices.doctor.model.dto.UpdatePatientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "PATIENT-SERVICE")
public interface PatientProxy {

    @PostMapping("/add-patient")
    public PatientDto save(@RequestBody AddPatientDto dto);

    @PutMapping("/update-patient")
    public PatientDto update(@RequestBody UpdatePatientDto dto);

    @DeleteMapping("/delete-patient")
    public void delete(@RequestParam Long id);

    @GetMapping("/get-patient")
    public PatientDto get(@RequestParam Long id);


}
