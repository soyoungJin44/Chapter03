package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",ds,35");
		
		//.concat() : 두 문자열 이어줘
		/*
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a+b);
		*/
		
		a = a.concat(b);
		System.out.println(a);
		System.out.println("=============");
		
		//앞 뒤 공백 없애줌
		a = a.trim();
		System.out.println(a);
		System.out.println("===========");
		
		//앞에 입력한ab >> 입력한 문자열로 바꿔서 출력해줌
		a = a.replace("ab", "12");
		System.out.println(a);
		
		//,기준으로 나눠줘. 
		String[] sArray = a.split(",");
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		System.out.println(sArray[2]);
		System.out.println("=============");

		//substring()안에 들어간 숫자방부터 출력해줘(==앞에 그만큼 짤라줘)
		String str = "Hello JAVA!";
		
		String result01 = str.substring(3);
		System.out.println(result01);
		System.out.println("===================");
		String result02 = str.substring(1,7);
		System.out.println(result02);
		System.out.println("====================");
		
		//charAt()안에 입력한 숫자의 칸만 알려줘
		char result03 = str.charAt(2 );
		System.out.println(result03);
		
		
	}

}
