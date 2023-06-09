package com.example.advanceacademy.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class HotelRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String country;
    @NotBlank
    private String city;
    @NotBlank
    private String zip;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private String streetAddress;
    private String description;
}
