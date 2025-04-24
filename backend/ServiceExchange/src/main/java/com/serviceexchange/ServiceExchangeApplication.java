package com.serviceexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ServiceExchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceExchangeApplication.class, args);
    }

}
