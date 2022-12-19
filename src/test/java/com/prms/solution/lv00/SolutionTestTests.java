package com.prms.solution.lv00;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SolutionTestTests {
	
	@Autowired
	private Lv00Service lv00Service;

	@Test
	void contextLoads() {
		
		System.out.println(" test  test  test  test  test  test  test  test ");
		
		lv00Service.lv();
		
	}

}
