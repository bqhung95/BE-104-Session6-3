package com.example.patientservice.dto;

import lombok.Data;

@Data
public class PatientRequestDTO {
    private Long id; // Có thể để null nếu DB tự tăng, nhưng đề bài yêu cầu gửi id nên ta giữ
    private String fullName;
    private String address;
    private String medicalHistory;


}
