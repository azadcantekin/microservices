package com.devs.microservices.advertservice.controller;

import com.devs.microservices.advertservice.model.Advert;
import com.devs.microservices.advertservice.service.AdvertService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/advert")
@RequiredArgsConstructor
public class AdvertController {
    private final AdvertService advertService;

    @PostMapping("add-advert")
    public ResponseEntity<?> addAdvert(@RequestBody Advert advert){
        return ResponseEntity.ok(advertService.addAdvert(advert));
    }

    @GetMapping("get-all-advert")
    public ResponseEntity<?> getAllAdvert(){
        return ResponseEntity.ok(advertService.getAllAdvert());
    }
}
