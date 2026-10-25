package com.example.patientservice.controller;

import com.example.patientservice.dto.PatientRequestDTO;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<Patient> createPatient(@RequestBody PatientRequestDTO request) {
        Patient newPatient = patientService.createPatient(request);
        return new ResponseEntity<>(newPatient, HttpStatus.CREATED);
    }
}
