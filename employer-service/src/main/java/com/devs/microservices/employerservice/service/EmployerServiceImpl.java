package com.devs.microservices.employerservice.service;

import com.devs.microservices.employerservice.model.Employer;
import com.devs.microservices.employerservice.repository.EmployerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployerServiceImpl implements EmployerService{

    private final EmployerRepository employerRepository;

    @Override
    public Employer addEmployer(Employer employer) {
        return employerRepository.save(employer);
    }
}
