package com.devs.microservices.advertservice.service;

import com.devs.microservices.advertservice.model.Advert;
import com.devs.microservices.advertservice.repository.AdvertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvertServiceImpl implements AdvertService{

    private final AdvertRepository advertRepository;

    @Override
    public Advert addAdvert(Advert advert) {
        return advertRepository.save(advert);
    }

    @Override
    public List<Advert> getAllAdvert() {
        return advertRepository.findAll();
    }
}
