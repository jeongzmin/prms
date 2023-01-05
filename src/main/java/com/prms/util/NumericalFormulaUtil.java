package com.prms.util;

public class NumericalFormulaUtil {

	private NumericalFormulaUtil() {}

	/*
	 * 최종 검증 (2022.12.22) 
	 */
	
	/*
	 * 최대공약수(Greatest Common Divisor, GCD), 두 자연수의 공통된 약수 중 가장 큰 수
	 * 유클리드 호제법. 최대공약수_구하기
	 */
	public static int gcd(int a, int b){
		if (b == 0) return a;
		return gcd(b, a%b);
	}
	public static int gcd(int[] a) {
		if(a.length == 0 && a.length == 1) return 0;
		int size = a.length; 
		int result = 0;
		for (int i = 1; i < size; i++) {
			a[i] = gcd(a[i-1], a[i]);
			result = a[i];
		}
		return result; 
	}

	/*
	 * 최소공배수(Least Common Multiple, LCM)
	 * 최소공배수는 두 자연수의 곱 / 최대 공약수 라는 공식으로 구할 수 있습니다.
	 */
	public static int lcd(int a, int b){
		return a * b / gcd(a,b);
	}
	
	/*
	 * 각 두수의 공배수 구하기 (common multiple, CM)
	 */
	public static int[] cm(int a, int b){
		int result[] = {lcd(a, b) / a , lcd(a, b) / b};
		return result;
	}
	
	/*
	 * 각 두수의 공배수 구하기 (common multiple, CM)
	 * 대상 공배수 리턴
	 */
	public static int cm(int a, int b, int c){
		return lcd(a, b) / c;
	}
	
	/*
	 *  미검증
	 */

}
