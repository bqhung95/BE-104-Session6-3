package com.example.doctorservice.service;

import com.example.doctorservice.dto.DoctorResponseDTO;
import com.example.doctorservice.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public List<DoctorResponseDTO> getAllDoctors() {
        return doctorRepository.findAll().stream()
                .map(doctor -> new DoctorResponseDTO(
                        doctor.getId(),
                        doctor.getName(),
                        doctor.getSpecialization()
                ))
                .collect(Collectors.toList());
    }
}
