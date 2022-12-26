package com.prms.solution.lv00;

import org.springframework.stereotype.Service;

@Service
public class oneService {

	/*
	 * 입출력 예 #1
		"hello"의 1번째 인덱스인 "e"와 2번째 인덱스인 "l"을 바꾸면 "hlelo"입니다.
		
		입출력 예 #2
		"I love you"의 3번째 인덱스 "o"와 " "(공백)을 바꾸면 "I l veoyou"입니다.
	 */
	public void 인덱스바꾸기(String my_string, int num1, int num2) {
		
		char str1 = my_string.toCharArray()[num1];
		char str2 = my_string.toCharArray()[num2];
		char[] str = my_string.toCharArray();
		
		str[num1] = str2;
		str[num2] = str1;
	}
	
}
