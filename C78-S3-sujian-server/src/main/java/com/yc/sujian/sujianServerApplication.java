package com.yc.sujian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class sujianServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(sujianServerApplication.class, args);
	}

}
