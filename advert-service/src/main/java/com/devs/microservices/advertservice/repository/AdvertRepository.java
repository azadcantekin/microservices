package com.devs.microservices.advertservice.repository;

import com.devs.microservices.advertservice.model.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertRepository extends JpaRepository<Advert , Integer> {
}
