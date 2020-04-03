package com.yc.lolshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class lolshopZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(lolshopZuulApplication.class, args);
	}

}
