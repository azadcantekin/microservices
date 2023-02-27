package com.devs.microservices.employerservice.controller;

import com.devs.microservices.employerservice.model.Employer;
import com.devs.microservices.employerservice.model.request.AdvertResponse;
import com.devs.microservices.employerservice.service.EmployerService;
import com.devs.microservices.feignclients.advert.AdvertRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employer")
@RequiredArgsConstructor
public class EmployerController {

    private final EmployerService employerService;


    @PostMapping("add-employer")
    public ResponseEntity<?> addEmployer(@RequestBody Employer employer){
        return ResponseEntity.ok(employerService.addEmployer(employer));
    }

    @PostMapping("add-advert")
    public AdvertResponse addAdvert(@RequestBody AdvertRequest advertRequest){
        return employerService.addAdvert(advertRequest);
    }
}
