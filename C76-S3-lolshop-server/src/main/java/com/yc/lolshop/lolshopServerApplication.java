package com.yc.lolshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class lolshopServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(lolshopServerApplication.class, args);
	}

}
