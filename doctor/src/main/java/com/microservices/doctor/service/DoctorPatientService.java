package com.microservices.doctor.service;

import com.microservices.doctor.model.dto.AddPatientDto;
import com.microservices.doctor.model.dto.PatientDto;
import com.microservices.doctor.model.dto.UpdatePatientDto;
import com.microservices.doctor.proxy.PatientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DoctorPatientService {

     @Autowired
     private PatientProxy patientProxy;

    public PatientDto getPatient(Long id){
        return this.patientProxy.get(id);
    }

    public PatientDto savePatient(AddPatientDto dto){
        return this.patientProxy.save(dto);
    }

    public PatientDto updatePatient(UpdatePatientDto dto){
        return this.patientProxy.update(dto);
    }
    public void deletePatient(Long id){
        this.patientProxy.delete(id);
    }

}
