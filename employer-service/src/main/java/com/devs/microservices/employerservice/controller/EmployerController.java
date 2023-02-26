package com.devs.microservices.employerservice.controller;

import com.devs.microservices.employerservice.model.Employer;
import com.devs.microservices.employerservice.service.EmployerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employer")
@RequiredArgsConstructor
public class EmployerController {

    private final EmployerService employerService;


    @PostMapping("add-employer")
    public ResponseEntity<?> addEmployer(@RequestBody Employer employer){
        return ResponseEntity.ok(employerService.addEmployer(employer));
    }
}
