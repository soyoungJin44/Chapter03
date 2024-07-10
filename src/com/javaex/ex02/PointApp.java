package com.javaex.ex02;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p00 = new Point(3,5);
		
		System.out.println(p00.toString());		//오버라이딩x , 재정의 ㅇㅇ
		System.out.println(p00.getClass());		//주소값
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(37,58);
		Point p03 = p02;
		
		
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println(p00.equals(p01));		//값 비교x, 주소값 비교 ㅇㅇ
		System.out.println(p00.equals(p02));
		System.out.println(p02.equals(p03));
		
		System.out.println("==========");
		System.out.println(p00.equals(p01));	//point class에서 재정의 했기 때문에 값들 비교 ㅇㅇ 
		
	}

}
