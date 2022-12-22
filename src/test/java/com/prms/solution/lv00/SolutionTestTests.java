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
class SolutionTestTests {
	
	@Autowired
	private Lv00Service service;
	
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
	 * 기초 데이터 값
	 */
	@DisplayName("기초 데이터 값")
	private static Stream<Arguments> setParameter() {
	    return Stream.of(
    		Arguments.of(1, 2, 2, 4),
    		Arguments.of(1, 10, 2, 20),
    		Arguments.of(1, 10, 2, 14),
	    	Arguments.of(9, 2, 1, 3)
	    );
	}
	
	/*
	 * 기대 결과 값
	 */
	@DisplayName("기대 결과 값")
	private static Stream<Arguments> endParameter() {
		return Stream.of(
				Arguments.of(1, 2),
				Arguments.of(9, 2)
			);
	}

//	@DisplayName("분수의덧셈 Tests")
	@ParameterizedTest(name ="{index} {displayName} message = {0}, {1}, {2}, {3}")
//	@ParameterizedTest(name ="{index} {displayName} message = {0}")
	@MethodSource("setParameter")
//	@NullSource
//	@EmptySource
	void 분수의덧셈(int denum1, int num1, int denum2, int num2) throws Exception{
		int[] answer = {};
		
		answer = service.분수의덧셈( denum1, num1, denum2, num2 );
		
		logger.debug("answer = {}", answer);
	}
}
