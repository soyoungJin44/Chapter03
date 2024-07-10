package com.javaex.practice02;

public class Rectangle {
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	//메서드 gs

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메서드 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public boolean equals(Object obj) {
		boolean result;
		Rectangle r = (Rectangle)obj;
		
		if((this.width*this.height) == (r.width*r.height)) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
