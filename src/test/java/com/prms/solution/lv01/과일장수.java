package com.prms.solution.lv01;

import static com.prms.util.LogbackLineUtil.drawLine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest; 

@SpringBootTest
@DisplayName("JUnit Exam")
class 과일장수 {
	
	@Autowired
	private 과일장수Service service;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@BeforeEach public void strt() { drawLine(logger); }
	@AfterEach public void end() { drawLine(logger); }
	
	@DisplayName("과일장수")
	@ParameterizedTest(name = "{index} {displayName}")
	@MethodSource("com.prms.solution.params.methodParams#과일장수")
	void Q1_과일장수(int k, int m, int[] score) throws Exception {
		
		logger.debug("입력값 = {}, {}, {}", k, m, score);
		
		int result = service.과일장수(k, m, score);
		
		logger.debug("출력값 = {}", result);
	}
}
