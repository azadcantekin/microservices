package com.devs.microservices.apigw.fallback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CircuitBreakerController {

    private static final Logger logger =  LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/advert-fallback")
    public String fallBackAdvert(){
        logger.info("Fall back for advert");
        return "Fall back";
    }
}
