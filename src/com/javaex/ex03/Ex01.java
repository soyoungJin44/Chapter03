package com.javaex.ex03;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//String >> 같은 값이 인지되면, 같은 주소 class를 찾아서 넣어준다.
		
		String s00 = new String("반갑습니다.");
		
		String s01 = "안녕하세요";
		String s02 = "반갑습니다.";
		String s03 = "안녕하세요";
		
		System.out.println(s01.equals(s02));
		System.out.println(s01.equals(s03));
		System.out.println(s00.equals(s02));
		
		//같은 주소값에 들어가짐 짱신기
		System.out.println(s01.hashCode());
		System.out.println(s03.hashCode());
		
		
		
		
	}
	
}
