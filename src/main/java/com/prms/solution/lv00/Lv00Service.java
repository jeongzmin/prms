package com.prms.solution.lv00;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prms.util.NumericalFormulaUtil;

@Service
public class Lv00Service {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

//	입력값 〉	1, 2, 3, 4
//	기댓값 〉	[5, 4]
	public int[] 분수의덧셈(int denum1, int num1, int denum2, int num2) {
		int[] answer = {0, 0};
		int[] denum = {denum1, denum2};
		int[] gcd = NumericalFormulaUtil.gcd(num1, num2);
		
//		denum1*gcd[0]  +  denum2*gcd[1]  
//		num1*gcd[0]       num2*gcd[1]
		
		logger.debug("= {} , {}" 
				, denum1*gcd[0]  +  denum2*gcd[1]
				, num1*gcd[0]
			);
		
		
		return answer;
	}

}
