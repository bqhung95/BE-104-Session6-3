package com.example.patientservice.service;

import com.example.patientservice.dto.PatientRequestDTO;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient createPatient(PatientRequestDTO request) {
        // Map dữ liệu từ DTO sang Entity
        Patient patient = Patient.builder()
                .id(request.getId()) // Nếu muốn DB tự sinh ID thì bỏ dòng này
                .fullName(request.getFullName())
                .address(request.getAddress())
                .medicalHistory(request.getMedicalHistory())
                // Các trường còn lại chưa có dữ liệu từ API này nên sẽ là null
                .build();

        return patientRepository.save(patient);
    }
}