package com.devs.microservices.employerservice.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdvertRequest {
    private Integer employerId;
    private String title;
    private String description;
}
