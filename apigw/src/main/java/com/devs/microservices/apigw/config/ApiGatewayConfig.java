package com.devs.microservices.apigw.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p->p.path("/api/v1/auth/**")
                        .uri("lb://auth-service"))
                .route(p->p.path("/api/v1/advert/**")
                        .uri("lb://advert-service"))
                .route(p->p.path("/api/v1/employer/**")
                        .uri("lb://employer-service"))
                .build();
    }
}
