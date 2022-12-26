package com.prms.solution.lv00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public int[] 배열두배만들기(int[] answer) {
		int count = 0; 
		for (int i : answer) {
			answer[count ++] = i * 2;
		}
		return answer;
	}

	//3  4  5  2  1
	
	public int 중앙값구하기(int[] array) {
		
		int count = array.length; 
		for (int i = 0; i < count-1; i++) {
			if(array[i] >= array[i+1]) {
				//진행
			}else {
				int _a = array[i+1];
				int _b = array[i];
				array[i] = _a;
				array[i+1] = _b;
				i = -1;
			}
		}
		
		int mid = (int) count/2;
		return array[mid];
	}

	//public int 최빈값구하기(int[] array) {
	//	int returnInt = 0;
	//	int index = 0; int maxCount = 0;
	//	for (int i : array) {
	//		
	//	}
	//	return returnInt;
	//}
	/*
	 * 프로그래머스 사용불가 HashMap
	 */
	public int 최빈값구하기(int[] array) {
		
		Map<String, Integer> params1 = new HashMap<String, Integer>();
		int maxCnt = 0;
		String maxStr = "";
		int returnInt = 0;
		
		for (int i : array) {
			String putStr = i + "";
			Integer getNum = params1.get(putStr) == null ? 0 : params1.get(putStr);
			
			params1.put(putStr, getNum+1); 
			
			if(params1.get(putStr) > maxCnt) {
				maxCnt = params1.get(putStr);
				maxStr = putStr;
				returnInt = i;
			}
		}
		
		for ( String key : params1.keySet() ) {
		    if(!maxStr.equals(key) && params1.get(key).toString().equals((maxCnt+""))) {
		    	return -1;
		    }
		}
		    
		//TODO 프로그래머스 HashMap Not found
		
		//TODO 프로그래머스 Map Not found
		// 방법1) 
		//for ( String key : map.keySet() ) {
		//    System.out.println("방법1) key : " + key +" / value : " + map.get(key));
		//}
		//System.out.println("=======================");
		// 
		
		//TODO 프로그래머스 Map.Entry Not found
		//// 방법2)
		//for ( Map.Entry<String, String> entry : map.entrySet() ) {
		//    System.out.println("방법2) key : " + entry.getKey() +" / value : " + entry.getKey());
		//}
		//System.out.println("=======================");
		// 
		
		//TODO 프로그래머스 Iterator Not found
		//// 방법3)
		//Iterator<String> keys = map.keySet().iterator();
		//while ( keys.hasNext() ) {
		//    String key = keys.next();
		//    System.out.println("방법3) key : " + key +" / value : " + map.get(key));
		//}   

		return returnInt;
	}

	public int[] 짝수는싫어요(int n) {
		List<Integer> newArray = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			if(i%2 == 1) {
				newArray.add(i);
			}
		}
		return newArray.stream().mapToInt(x -> x).toArray();
	}

}
