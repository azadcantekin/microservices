package com.devs.microservices.feignclients.advert;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "ADVERT-SERVICE" )
public interface AdvertClient {

    @PostMapping(path = "api/v1/advert/add-advert")
    Response addAdvert(AdvertRequest advertRequest);
}
