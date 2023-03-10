package com.devs.microservices.authentication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_user")
@Builder
public class User {
    @Id
    @SequenceGenerator(
            name = "authentication_id_sequence",
            sequenceName = "authentication_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "authentication_id_sequence"
    )
    private Integer id;
    private String email;
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    List<Role> roles = new ArrayList<>();
}
