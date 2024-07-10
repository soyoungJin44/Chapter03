package com.javaex.ex05;

public class Ex01 {
	
	
	//래퍼클랫스
	public static void main(String[] args) {
		
		int a = 3;
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		// 3 + 5   >> 지금은 그냥 쓰던대로 쓰면됨 그렇구나
		Integer sum = new Integer(3) + new Integer(5);
		System.out.println(sum);
		
		//Integer v01 = new Integer(3); 간단하게 표현 가능함. 추후에 v01.으로 값 가져와서 쓸 수 있음
		Integer v01 = 3;		//자동으로 박싱 됨ㅇㅇ
		
		//박싱하면 .toString() 으로 출력가능함
		Integer v02 = i;		//자동 언박싱됨
		System.out.println(i.toString());
		
		System.out.println("===================");
		
		Integer r01 = 100;	//자동 언박싱
		
		//parseInt : 안에 문자열을 숫자로 출력해줌  >> 숫자 더해짐 >>static으로 스태틱에 올라와있음. 그냥 쓰면됨
		
		//굳이
		int result = r01.parseInt("123456789");
		System.out.println(result);
		System.out.println(result+3);
		//ㅇㅇ  static이해
		int result02 = Integer.parseInt("1354");
		System.out.println(result02);
		
		//정수 ==> 문자열 로 변경
		
		String s99 = String.valueOf(5555); //이렇게 잘 안쓰고
		System.out.println(s99);
		System.out.println(s99 + 5);
		
		String s100 = "" + 555;
		System.out.println(s100 + 9);
		
		
		
		
	}

}
