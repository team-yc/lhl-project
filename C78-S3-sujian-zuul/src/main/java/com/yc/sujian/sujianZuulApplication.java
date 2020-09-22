package com.yc.sujian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class sujianZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(sujianZuulApplication.class, args);
	}

}
