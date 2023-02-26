package com.devs.microservices.employerservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_employer")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

    @Id
    @SequenceGenerator(
            name = "employer_id_sequence",
            sequenceName = "employer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employer_id_sequence"
    )
    private Integer id;
    private Integer userId;
    private String companyName;
}
