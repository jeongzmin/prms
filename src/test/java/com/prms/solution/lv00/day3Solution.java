package com.prms.solution.lv00;

import static com.prms.util.LogbackLineUtil.drawLine;

import java.util.Random;
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
class day3Solution {
	
	@Autowired
	private day3Service service;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@BeforeEach
	public void strt() {
		drawLine(logger);
	}
	
	@AfterEach
	public void end() {
		drawLine(logger);
	}
	
	@DisplayName("분수의덧셈 기초 데이터 값")
	private static Stream<Arguments> 분수의덧셈_parameter() {
	    return Stream.of(
    		Arguments.of(1, 2, 2, 4),
    		Arguments.of(1, 10, 2, 20),
    		Arguments.of(1, 10, 2, 14),
	    	Arguments.of(9, 2, 1, 3)
	    );
	}
	
//	@ParameterizedTest(name ="{index} {displayName} message = {0}")
//	@NullSource
//	@EmptySource
	
//	@DisplayName("분수의덧셈 Tests")
//	@ParameterizedTest(name ="{index} {displayName} message = {0}, {1}, {2}, {3}")
	@MethodSource("분수의덧셈_parameter")
	void 분수의덧셈(int denum1, int num1, int denum2, int num2) throws Exception{
		int[] answer = {};
		answer = service.분수의덧셈( denum1, num1, denum2, num2 );
		logger.debug("answer = {}", answer);
	}
	
	@SuppressWarnings("unused")
	private static Stream<Arguments> 배열두배만들기_parameter() {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
	    return Stream.of(
//    		Arguments.of(random.nextInt(), random.nextInt())
    		Arguments.of(((int)(Math.random() * 100)), ((int)(Math.random() * 100)))
	    );
	}
	
//	@DisplayName("배열두배만들기 Tests")
//	@ParameterizedTest(name ="{index} {displayName} message = {0}")
//	@MethodSource("배열두배만들기_parameter")
//	@EmptySource
	void 배열두배만들기(int num1, int num2) throws Exception{
		int[] answer = {num1, num2};
		
		logger.debug("입력값 = {}", answer);
		
		answer = service.배열두배만들기( answer );
		
		logger.debug("출력값 = {}", answer);
	}

	private static Stream<Arguments> 나머지구하기_parameter() {
		return Stream.of(
				Arguments.of(3, 2)
				, Arguments.of(10, 5)
			);
	}
	
	@DisplayName("나머지구하기 Tests")
//	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("나머지구하기_parameter")
	void 나머지구하기(int num1, int num2) throws Exception {
		
		//입출력 예 #1
		//num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.

		//입출력 예 #2
		//num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.
		
		logger.debug("answer = {}", num1%num2);
	}
	
	private static Stream<Arguments> 중앙값구하기_parameter() {
		return Stream.of(
				Arguments.of(
					((int) (Math.random() * 100))
					, ((int) (Math.random() * 100))
					, ((int) (Math.random() * 100))
					, ((int) (Math.random() * 100))
					, ((int) (Math.random() * 100))
				)
			);
	}
	
	@DisplayName("중앙값구하기 Tests")
//	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("중앙값구하기_parameter")
	void 중앙값구하기(int num1, int num2, int num3, int num4, int num5) throws Exception {
		int params[] = {num1,num2,num3,num4,num5};
		int answer = 0;
		
		logger.debug("입력값 = {}", params);
		
		answer = service.중앙값구하기( params );
		
		logger.debug("추출값 = {}", answer);
	}
	
	@DisplayName("최빈값구하기 Tests")
//	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("최빈값구하기_parameter")
	void 최빈값구하기(int num1, int num2, int num3, int num4, int num5, int num6) throws Exception {
		int params[] = {num1,num2,num3,num4,num5,num6};
//		int params[] = {1,1,2,2};
		
		int answer = 0;
		
		logger.debug("입력값 = {}", params);
		
		answer = service.최빈값구하기( params );
		
		logger.debug("출력값 = {}", answer);
	}
	
	private static Stream<Arguments> 최빈값구하기_parameter() {
		return Stream.of(
				Arguments.of(
					((int) (Math.random() * 10))
					, ((int) (Math.random() * 10))
					, ((int) (Math.random() * 10))
					, ((int) (Math.random() * 10))
					, ((int) (Math.random() * 10))
					, ((int) (Math.random() * 10))
					)
			);
	}
	
	@DisplayName("짝수는싫어요 Tests")
	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@MethodSource("짝수는싫어요_parameter")
	void 짝수는싫어요(int n) throws Exception {
		logger.debug("입력값 = {}", n);
		
		int[] answer = {};
		answer = service.짝수는싫어요( n );
		
		logger.debug("출력값 = {}", answer);
		
	}
	private static Stream<Arguments> 짝수는싫어요_parameter() {
		return Stream.of(Arguments.of(((int) (Math.random() * 20))));
	}

}
