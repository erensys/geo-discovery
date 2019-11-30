package com.geo.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GeoDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoDiscoveryApplication.class, args);
	}

}

