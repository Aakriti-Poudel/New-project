package com.example.dto.SpringbootDTO.dto;

import lombok.Data;

@Data

public class UserLocationDTO {
    private Long userId;
    private String email;
    private String place;
    private Double longitude;
    private Double latitude;
}
