package com.javaex.ex02;

public class Point{

	private int x;
	private int y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean result;
		Point p = (Point)obj;
		
		//this.x==0x777.x && this.y==0x777.y
		if(this.x == p.x && this.y == p.y) {
			result = true;
			//return true;
		}else {
			result = false;
			//return false;
		}
		
		return result;
	}

	
	
	
	
	
	
	
}
