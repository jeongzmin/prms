package com.prms.solution.lv01;

import static com.prms.util.LogbackLineUtil.drawLine;

import java.util.ArrayList;
import java.util.Arrays;
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
class 과일장수Solution {
	
	@Autowired
	private 과일장수Service service;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@BeforeEach
	public void strt() {
		drawLine(logger);
	}
	
	@AfterEach
	public void end() {
		drawLine(logger);
	}
	
	/*
		입출력 예
		k	m	score													result
		3	4	[1, 2, 3, 1, 2, 3, 1]								8
		4	3	[4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]			33
	*/
	@DisplayName("과일장수 Tests")
	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("과일장수_parameter")
	void 과일장수(int k, int m, int numbers) throws Exception {
		int answer = 0;
        
        int _numbers = numbers;
        int[] score = (new ArrayList<Integer>(){
	        	int num = _numbers; 
				private static final long serialVersionUID = 1L;
				{ 
					do{
			            add(num % 10); num /= 10;
			        } while  (num > 0);
				}
			}
        ).stream().mapToInt(Integer::intValue).toArray();

		logger.debug("입력값 = {}", k, m, score);
		
		answer = service.과일장수(k, m, score);
		
		logger.debug("출력값 = {}", answer );
		
	}
	private static Stream<Arguments> 과일장수_parameter() {
		
		int numbers = (int) (
				 ((int) (Math.random() * 10* 10* 10* 10* 10* 10* 10* 10* 10))
				/ Math.pow(10, ((int) (Math.random() * 9)) )
			);
		
		return Stream.of(
			Arguments.of(
					((int) (Math.random() * 9))
					, ((int) (Math.random() * 9))
					, numbers
				));
	}
	
}
