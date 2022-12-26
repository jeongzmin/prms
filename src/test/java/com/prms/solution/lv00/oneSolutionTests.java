package com.prms.solution.lv00;

import static com.prms.util.LogbackLineUtil.drawLine;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest; 

@SpringBootTest
@DisplayName("JUnit Exam")
class oneSolutionTests {
	
	@Autowired
	private oneService service;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@BeforeEach
	public void strt() {
		drawLine(logger);
	}
	
	@AfterEach
	public void end() {
		drawLine(logger);
	}
	
	@DisplayName("인덱스바꾸기 Tests")
	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("인덱스바꾸기_parameter")
	void 인덱스바꾸기(String my_string, int num1, int num2) {
        String answer = "";
        
        logger.debug("입력값 = {}, {}, {}", my_string, num1, num2);
        
        service.인덱스바꾸기(my_string, num1, num2);
        
        logger.debug("출력값 = {}", answer);
        
    }
	
	private static Stream<Arguments> 인덱스바꾸기_parameter() {
		return Stream.of(Arguments.of(
				"인덱스 바꾸기 파라미터 랜덤"
				, ((int) (Math.random() * 10))
				, ((int) (Math.random() * 10))
			));
	}
	
	
}
