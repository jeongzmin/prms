package com.prms.solution.assignment;

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
class 풀이진행가이드 {
	
	@BeforeEach public void strt() { drawLine(logger); }
	@AfterEach public void end() { drawLine(logger); }
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/*
	* 기초 세팅
	* 
	* 모든 테스트는 JUnit5를 이용하여 진행하며, 간단하게 문제별 랜덤 파라미터를 세팅하여 
	* 입출력 값을 확인 가능하도록 세팅되어있다.
	* 
	* 가능하면 Service 부문에 입력 매개번수명과 출력매개변수명을 프로그래머스 문제와 동일하게 세팅한다.
	* 이는 최종 코드실행 및 제출 후 채점하기를 프로그래머스를 통해서 완료하기 때문이다.
	* 
	*/

}
