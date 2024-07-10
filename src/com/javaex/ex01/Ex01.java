package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();
		
		int hc = obj1.hashCode();
		//System.out.println(hc);
		
		//기본으로 값이 설정되어 있는 것들이라서 값을 넣어주지 않고 사용해도 오류x 
		
		System.out.println(obj1.hashCode());		//hashCode >> 당분간 주소값 준다고 이해
		System.out.println(obj2.hashCode());
		
		System.out.println(obj1.getClass());		//class 정보  		
		System.out.println(obj2.getClass());
		
		System.out.println(obj1.toString());		
		System.out.println(obj2.toString());
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj1));
		System.out.println(obj1.equals(obj1));
	}

}
