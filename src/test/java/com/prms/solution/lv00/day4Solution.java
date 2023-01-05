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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest; 

@SpringBootTest
@DisplayName("JUnit Exam")
class day4Solution {
	
	@Autowired
	private day4Service service;
	
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
//	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("인덱스바꾸기_parameter")
	void 인덱스바꾸기(String my_string, int num1, int num2) {
        String answer = "";
        
        logger.debug("입력값 = {}, {}, {}", my_string, num1, num2);
        
        answer = service.인덱스바꾸기(my_string, num1, num2);
        
        logger.debug("출력값 = {}", answer);
        
    }
	
	private static Stream<Arguments> 인덱스바꾸기_parameter() {
		return Stream.of(Arguments.of(
				"인덱스 바꾸기 파라미터 랜덤"
				, ((int) (Math.random() * 10))
				, ((int) (Math.random() * 10))
			));
	}
	
	
	@DisplayName("피자나꿔먹기 Tests")
//	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("피자나꿔먹기_parameter")
	void 피자나꿔먹기(int n) throws Exception {
		
		logger.debug("입력값 = {}", n);
		
		int answer = 0;
		
		answer = service.피자나눠먹기(n);
		
		logger.debug("출력값 = {}", answer);
		
		
	}
	private static Stream<Arguments> 피자나꿔먹기_parameter() {
		return Stream.of(Arguments.of(((int) (Math.random() * 10))));
	}
	
	@DisplayName("피자최소공배수 Tests")
//	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("피자최소공배수_parameter")
	void 피자최소공배수(int n) throws Exception {
		
		logger.debug("입력값 = {}", n);
		
		int answer = 0;
		
		answer = service.피자최소공배수(n);
		
		logger.debug("출력값 = {}", answer);
	}
	private static Stream<Arguments> 피자최소공배수_parameter() {
		return Stream.of(Arguments.of(((int) (Math.random() * 10))));
	}
	
	@DisplayName("피자나눠먹기2 Tests")
//	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("피자나눠먹기2_parameter")
	void 피자나눠먹기2(int slice, int n) throws Exception {
		
		logger.debug("입력값 = {}", n);
		
		int answer = 0;
		
		answer = service.피자나눠먹기2(slice, n);
		
		logger.debug("출력값 = {}", answer);
	}
	private static Stream<Arguments> 피자나눠먹기2_parameter() {
		return Stream.of(Arguments.of(
				((int) (Math.random() * 10))
				, ((int) (Math.random() * 10))
			));
	}
	
	@DisplayName("피자나눠먹기3 Tests")
	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("피자나눠먹기3_parameter")
	void 피자나눠먹기3(int slice, int n) throws Exception {
		logger.debug("입력값 = {}", n);
		
		int answer = 0;
		
		answer = service.피자나눠먹기3(slice, n);
		
		logger.debug("출력값 = {}", answer);
	}
	
	private static Stream<Arguments> 피자나눠먹기3_parameter() {
		return Stream.of(Arguments.of(((int) (Math.random() * 10)), ((int) (Math.random() * 10))));
	}
	
	@DisplayName("배열의평균값 Tests")
	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("배열의평균값_parameter")
	void 배열의평균값(int num1, int num2, int num3, int num4) throws Exception {
		
		int numbers[] = {num1, num2, num3, num4};
		
		logger.debug("입력값 = {}", numbers);
		
		double answer = 0;
		
		answer = service.배열의평균값(numbers);
		
		logger.debug("출력값 = {}", answer);
		
	}
	private static Stream<Arguments> 배열의평균값_parameter() {
		return Stream.of(Arguments.of(
				((int) (Math.random() * 20)), ((int) (Math.random() * 20))
				, ((int) (Math.random() * 20)), ((int) (Math.random() * 20))
			));
	}
	
}
