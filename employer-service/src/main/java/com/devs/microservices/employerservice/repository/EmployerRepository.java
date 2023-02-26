package com.devs.microservices.employerservice.repository;

import com.devs.microservices.employerservice.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer , Integer> {
}
