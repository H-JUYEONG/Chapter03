package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		int a= 3; //기본
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(5);
		System.out.println(sum);
		
		//Integer v01 = new Integer(3);
		Integer v01 = 3;  //(자동)박싱
		
		int v02 = i;   //(자동)언박싱
		
		System.out.println("---------------------------");
		//문자열 -->정수
	    
		//덜 좋은방식
		Integer r01 = 100;  //자동박싱
		int result = r01.parseInt("1234567");
		System.out.println(result + 3);
		
		//조금더 좋은방식   static이해
		int result02 = Integer.parseInt("121334556");
		System.out.println(result02);
		
		
		//정수 --> 문자열
		String s99 = String.valueOf(5555);
		System.out.println(s99);
		System.out.println(s99+5 );
		
		String s100 = ""+5555;
		
		System.out.println(s100 + 9);
		
	}
	
}
