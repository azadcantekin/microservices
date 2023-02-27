package com.devs.microservices.employerservice.service;

import com.devs.microservices.employerservice.model.Employer;
import com.devs.microservices.employerservice.model.request.AdvertResponse;
import com.devs.microservices.employerservice.repository.EmployerRepository;
import com.devs.microservices.feignclients.advert.AdvertClient;
import com.devs.microservices.feignclients.advert.AdvertRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployerServiceImpl implements EmployerService{

    private final EmployerRepository employerRepository;
    private final AdvertClient advertClient;

    @Override
    public Employer addEmployer(Employer employer) {
        return employerRepository.save(employer);
    }

    @Override
    public AdvertResponse addAdvert(AdvertRequest advertRequest) {
        advertClient.addAdvert(advertRequest);
        return AdvertResponse.builder()
                .status(true)
                .message("success")
                .build();
    }
}
