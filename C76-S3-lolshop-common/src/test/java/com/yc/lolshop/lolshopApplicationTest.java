package com.yc.lolshop;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.yc.lolshop.dao.UserMapper;


@SpringBootTest
public class lolshopApplicationTest {
	
	@Resource
	private UserMapper um;
	
	@Test
	public void test1() {
		System.out.println( um.selectByExample(null) );
	}
	
}
