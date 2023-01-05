package com.prms.solution.lv00;

import static com.prms.util.LogbackLineUtil.drawLine;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest; 

@SpringBootTest
@DisplayName("JUnit Exam")
class day5Solution {
	
//	@Autowired
//	private day5Service service;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@BeforeEach
	public void strt() {
		drawLine(logger);
	}
	
	@AfterEach
	public void end() {
		drawLine(logger);
	}
	
	@DisplayName("Sample Tests")
	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("Sample_parameter")
	void Sample(int num1) throws Exception {
		logger.debug("answer = {}", num1);
	}
	private static Stream<Arguments> Sample_parameter() {
		return Stream.of(Arguments.of(((int) (Math.random() * 100)), ((int) (Math.random() * 100))));
	}
	
}
