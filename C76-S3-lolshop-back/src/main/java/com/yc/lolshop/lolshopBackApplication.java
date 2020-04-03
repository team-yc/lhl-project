package com.yc.lolshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
//mybatis的接口组件扫描
@MapperScan("com.yc.lolshop")
//开启声明式远程服务调用
@EnableFeignClients
//Spring会话共享注解
@EnableRedisHttpSession
public class lolshopBackApplication{

	public static void main(String[] args) {
		SpringApplication.run(lolshopBackApplication.class, args);
	}

}
