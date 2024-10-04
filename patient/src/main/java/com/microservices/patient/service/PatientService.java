package com.microservices.patient.service;

import com.microservices.patient.model.dto.AddPatientDto;
import com.microservices.patient.model.dto.PatientDto;
import com.microservices.patient.model.dto.UpdatePatientDto;
import com.microservices.patient.model.entity.Patient;
import com.microservices.patient.model.mapper.PatientMapper;
import com.microservices.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private PatientRepository patientRepository;

    private List<String> names = Arrays.asList("Ahmed", "Abdelrhman", "Khaled"); //Act as DB

    public String getName(String name) {
        return names.stream().filter(n -> n.equals(name))
                .findAny()
                .orElse("No patient found!");
    }

    public PatientDto save(AddPatientDto dto) {
        Patient addPatient = patientMapper.toEntity(dto);
        Patient patient = patientRepository.save(addPatient);
        return patientMapper.toDto(patient);
    }

    public PatientDto update(UpdatePatientDto dto) {
        Patient updateEntity = this.patientMapper.toEntity(dto);
        Patient patient = patientRepository.save(updateEntity);
        return this.patientMapper.toDto(patient);
    }

    public void delete(Long id) {
        this.patientRepository.deleteById(id);
    }

    public PatientDto get(Long id) {
        Optional<Patient> patient = patientRepository.findById(id);
        return this.patientMapper.toDto(patient.get());
    }


}
