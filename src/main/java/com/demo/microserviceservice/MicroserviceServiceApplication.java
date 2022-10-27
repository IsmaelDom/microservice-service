package com.demo.microserviceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info = @Info(title = "Microservicios API", version = "1.0", description = "Practica de Microservicios"))
public class MicroserviceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServiceApplication.class, args);
	}

}
