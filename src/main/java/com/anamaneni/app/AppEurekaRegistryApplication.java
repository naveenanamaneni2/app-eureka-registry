package com.anamaneni.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaRegistryApplication.class, args);
	}

}

