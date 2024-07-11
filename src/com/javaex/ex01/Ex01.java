package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj.getClass());//클래스 정보
		System.out.println(obj.toString());//java.lang.Object@327471b5 -->재정의
		System.out.println(obj.hashCode());//당분간은 주소라고 생각하자
		System.out.println(obj.equals(obj2));//두개가 같냐? false

		
		
		
		
		
		
		
		
	}

}
