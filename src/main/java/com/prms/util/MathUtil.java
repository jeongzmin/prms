package com.prms.util;

public class MathUtil {

	private MathUtil() {}

	//랜덤 int 구하기
	public static int getRandomInt(int scale){
		return (int) (Math.random() * scale);
	}
	public static int getRandomInt(){
		return getRandomInt(10);
	}
	
	//10의 제곱수 구하기
	public static int getPowTenInt(int num){
		return getPowInt(10, num);
	}
	
	//제곱수 구하기
	public static int getPowInt(int num1, int num2){
		return (int) Math.pow(num1, num2);
	}

}
