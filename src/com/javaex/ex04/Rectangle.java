package com.javaex.ex04;

public class Rectangle {

	// 필드
	public int width;
	public int height;

	// 생성자
	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 메소드 gs
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

	// 메소드 일반
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle) obj;
		
		int thisArea = this.width*this.height;
		int otherArea = r.width*r.height;
		
		if ( thisArea == otherArea ) {
			return true;
		} else {
			return false;
		}
	}

}
