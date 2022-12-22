package com.prms.solution.lv00;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prms.util.NumericalFormulaUtil;

@Service
public class Lv00Service {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/*
	 * 실행 계획
	 * [1] 입력값 〉	1, 2, 3, 4
	 * [2] 기댓값 〉	[5, 4]
	 * 
	 * 1. 두 분모의 공배수 값을 구한다.
	 * 2. 두 분수에 공배수 값을 곱한 후 더한다.
	 * 3. 분모, 분자를 대상으로 유클리드 호제법을 통해 최대공약수를 구한다.
	 * 3. 분모, 분자를 최대공약수로 나눈다.
	 * 4. 분모, 분자를 최대공약수로 나누면 두 수는 서로소가 되기 때문에 기약분수가 된다.
	 */
	public int[] 분수의덧셈(int denum1, int num1, int denum2, int num2) {
		int target1 = NumericalFormulaUtil.cm(num1, num2, num1);
		int target2 = NumericalFormulaUtil.cm(num1, num2, num2);
		
		int result1 = denum1*target1+denum2*target2; 
		int result2 = target1*num1; 
		int resultGcd = NumericalFormulaUtil.gcd(result1, result2);
		
		int result[] = {result1/resultGcd, result2/resultGcd};
		return result;
	}

}
