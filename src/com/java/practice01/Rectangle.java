package com.java.practice01;

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
	public void showInfo() {
		System.out.println(width + height);
	}
	
	public boolean equals(Rectangle)
	

}
