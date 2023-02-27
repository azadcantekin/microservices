package com.devs.microservices.employerservice.service;

import com.devs.microservices.employerservice.model.Employer;
import com.devs.microservices.employerservice.model.request.AdvertResponse;
import com.devs.microservices.feignclients.advert.AdvertRequest;

public interface EmployerService {
    Employer addEmployer(Employer employer);
    AdvertResponse addAdvert(AdvertRequest advertRequest);
}
