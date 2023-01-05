package com.prms.solution.lv00;

import org.springframework.stereotype.Service;

import com.prms.util.NumericalFormulaUtil;

@Service
public class day4Service {

	/*
	 * 입출력 예 #1
		"hello"의 1번째 인덱스인 "e"와 2번째 인덱스인 "l"을 바꾸면 "hlelo"입니다.
		
		입출력 예 #2
		"I love you"의 3번째 인덱스 "o"와 " "(공백)을 바꾸면 "I l veoyou"입니다.
	 */
	public String 인덱스바꾸기(String my_string, int num1, int num2) {
		
		String str1 = my_string.split("")[num1];
		String str2 = my_string.split("")[num2];
		String[] str = my_string.split("");
		
		str[num1] = str2;
		str[num2] = str1;
		
		return String.join("", str);
		
	}

	/*
	 
	머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 
	모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
	 
		입출력 예 #1 /// 7명이 최소 한 조각씩 먹기 위해서 최소 1판이 필요합니다.
		입출력 예 #2 /// 1명은 최소 한 조각을 먹기 위해 1판이 필요합니다.
		입출력 예 #3 /// 15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
	 
	 */
	public int 피자나눠먹기(int n) {
		return (int) Math.ceil(((double) n)/7);
	}

	/*
		10명이 모두 같은 양을 먹기 위해 최소 5판을 시켜야 피자가 30조각으로 모두 세 조각씩 먹을 수 있습니다.
	*/
	public int 피자최소공배수(int n) {
		return NumericalFormulaUtil.cm(6, n, 6);
	}

	/*
		머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
		피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, 
		n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 
		return 하도록 solution 함수를 완성해보세요.
		
		10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
		
		n명이 2~10조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 ?판을 시켜야 합니다.
	*/
	public int 피자나눠먹기2(int slice, int n) {
		return NumericalFormulaUtil.cm(slice, n, slice);
	}

	/*
		머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
		피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, 
		n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 
		return 하도록 solution 함수를 완성해보세요.
	
		10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
	*/
	public int 피자나눠먹기3(int slice, int n) {
		return ((int) Math.ceil(((double) n/slice)));
	}

	/*
		정수 배열 numbers가 매개변수로 주어집니다. 
		numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
	*/
	public double 배열의평균값(int[] numbers) {
		
		double value = 0;
		int count = numbers.length;
		for (int i : numbers) {
			value += i;
		}
		
		return (double) value/count;
	}
	
}
