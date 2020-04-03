package com.yc.lolshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//mybatis的接口组件扫描
@MapperScan("com.yc.lolshop")
public class lolshopCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(lolshopCommonApplication.class, args);
	}

}
