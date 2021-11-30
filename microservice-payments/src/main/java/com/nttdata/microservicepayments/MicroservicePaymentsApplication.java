package com.nttdata.microservicepayments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicePaymentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicePaymentsApplication.class, args);
    }

}
