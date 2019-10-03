package com.nagendra.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProducerApplication.class, args);
	}

}