package com.javaex.ex02;

public class Point {
	//object 는 따로 상속하는 관계가 아니더라도 모든 class에서 기본적으로 쓸 수 있다
	
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {  
		super();		//object 
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//메서드 gs

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//메서드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";   //object 기본 toString() 을 오버라이딩x,  재정의 ㅇㅇ
	}

	@Override //x==x && y===y;
	public boolean equals(Object obj) {
		boolean result;
		Point p = (Point)obj;		//받은 obj값을 Point형으로 형변환해서 p에 값 대입
			
		if(this.x == p.x && this.y == p.y) {
			result = true;	
			/*return true;*/
			
			}else {
				result = false;
				/*return false;*/
			}
		return result;
	}

	
}
