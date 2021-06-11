package com.javaex.ex03;

import com.javaex.ex02.Point;

public class Rectangle {


	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	
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
	
	
	
	public boolean equals(Object obj) {
		
		Rectangle r = (Rectangle)obj;
		
		int thisRect = this.width * this.height;
		int thatRect = r.width * r.height;
		
		if(thisRect == thatRect) {
			return true;
		}else {
			return false;
		}

		}
	
	
	
}
