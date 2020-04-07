package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class CrudMicroserviceDeletEdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudMicroserviceDeletEdataApplication.class, args);
	}

}
