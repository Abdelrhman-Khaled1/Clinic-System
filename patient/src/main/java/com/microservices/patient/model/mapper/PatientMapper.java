package com.microservices.patient.model.mapper;

import com.microservices.patient.model.dto.AddPatientDto;
import com.microservices.patient.model.dto.PatientDto;
import com.microservices.patient.model.dto.UpdatePatientDto;
import com.microservices.patient.model.entity.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    Patient toEntity(PatientDto dto);

    PatientDto toDto(Patient entity);

    Patient toEntity(UpdatePatientDto dto);

    Patient toEntity(AddPatientDto dto);
}
