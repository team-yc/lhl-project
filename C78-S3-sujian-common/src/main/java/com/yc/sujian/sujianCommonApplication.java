package com.yc.sujian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mybatis的接口组件扫描
@MapperScan("com.yc.sujian")
public class sujianCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(sujianCommonApplication.class, args);
	}

}
