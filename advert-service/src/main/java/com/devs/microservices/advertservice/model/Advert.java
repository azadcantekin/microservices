package com.devs.microservices.advertservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_advert")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer employerId;
    private String title;
    private String description;
}
