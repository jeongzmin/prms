package com.prms.solution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prms.solution.lv00.oneService;

@SpringBootTest
class PrmsApplicationTests {

	@Autowired
	private oneService lv00Application;
	
	@Test
	void contextLoads() {
		
		System.out.println(" test  test  test  test  test  test  test  test ");
		
	}
	
	@Test
	void contextLoads2() {
		
		System.out.println(" test  test  test  test  test  test  test  test 2");
		
//		lv00Application.lv();
		
	}

}
