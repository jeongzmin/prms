package com.prms.solution.lv00;

import java.util.stream.Stream;

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
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Lv00Service lv00Service;
	
	private static Stream<Arguments> getParameter() {
	    return Stream.of(
	      Arguments.of(1, 2, 3, 4),
	      Arguments.of(9, 2, 1, 3)
	    );
	  }

//	@DisplayName("분수의덧셈 Tests")
	@ParameterizedTest(name ="{index} {displayName} message = {0}")
//	@ParameterizedTest(name ="{index} {displayName} message = {0}")
	@MethodSource("getParameter")
//	@NullSource
//	@EmptySource
	void 분수의덧셈(int denum1, int num1 , int denum2, int num2) throws Exception{
		
		int[] answer = {};
		
		answer = lv00Service.분수의덧셈( denum1, num1, denum2, num2 );
		//		System.out.println(answer);
		
		System.out.println("결과 : "+denum1);
		
	}
}
