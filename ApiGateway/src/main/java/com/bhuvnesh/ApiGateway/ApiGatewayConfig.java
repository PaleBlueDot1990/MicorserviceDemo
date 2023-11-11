package com.bhuvnesh.ApiGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig
{
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder)
    {
        return builder.routes()
                      .route("users_route", r -> r.path("/users/**").uri("lb://user-microservice"))
                      .route("posts_route", r -> r.path("/posts/**").uri("lb://post-microservice"))
                      .build();

        /*
        Requests matching /users/** will be forwarded to the service registered with Eureka as "user-service."
        Requests matching /posts/** will be forwarded to the service registered with Eureka as "post-service."
        */
     }
}
