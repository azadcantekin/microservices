package com.devs.microservices.authentication.service;


import com.devs.microservices.authentication.model.request.AuthenticationRequest;
import com.devs.microservices.authentication.model.response.AuthenticationResponse;

public interface AuthenticationService {

    AuthenticationResponse register(AuthenticationRequest authenticationRequest);
    AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest);
}
