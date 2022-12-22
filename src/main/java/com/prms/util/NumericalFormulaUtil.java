package com.prms.util;

public class NumericalFormulaUtil {

	private NumericalFormulaUtil() {}
	
	/*
	 * 최대공약수(Greatest Common Divisor, GCD)
	 * 유클리드 호제법. 최대공약수_구하기
	 */
	public static int[] gcd(int a, int b){
		
		// 유클리드 호제법. 최대공약수_구하기
	    while(a % b != 0){
	        int r = a % b;
	        
	        if(r != 0){
	            a = b;
	            b = r;
	        }
	    }
	    
	    int result[] = {a , b};
	    return result;
	}

	//TODO 공식 결과 검증 필요
	/*
	 * 최소공배수(Least Common Multiple, LCM)
	 * 유클리드 호제법 활용. 최소공배수_구하기
	 * a * b / gcd(a,b);
	 */
//	public static int lcd(int a, int b){
//		int[] c = gcd(a,b);
//		return a * b / gcd;
//	}

}
