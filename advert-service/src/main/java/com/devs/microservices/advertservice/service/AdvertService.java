package com.devs.microservices.advertservice.service;

import com.devs.microservices.advertservice.model.Advert;

import java.util.List;

public interface AdvertService {
    Advert addAdvert(Advert advert);
    List<Advert> getAllAdvert();
}
