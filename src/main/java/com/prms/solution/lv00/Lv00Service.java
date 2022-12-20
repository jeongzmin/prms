package com.prms.solution.lv00;

import org.springframework.stereotype.Service;

@Service
public class Lv00Service {

//	입력값 〉	1, 2, 3, 4
//	기댓값 〉	[5, 4]
	public int[] 분수의덧셈(int denum1, int num1, int denum2, int num2) {
		int[] answer = {denum1*num2	+	denum2*num1, num1*num2	+	num2*num1};
//		answer = 
//		denum1*num2	+	denum2*num1
//		num1*num2	+	num2*num1
		return answer;
	}

}
