package com.javaex.ex04;

public class Rectangle {

	//필드
		private int width;
		private int height;
		
		//생성자
		public Rectangle() {
		}
		
		public Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
		}

		//메소드-gs
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

		//메소드-일반
		@Override
		public boolean equals(Object obj) {
			
			Rectangle r= (Rectangle)obj;
			
			int thisRect = this.width * this.height;
			int thatRect = r.width * r.height; 
			
			
			if(thisRect == thatRect) {
				return true;
			}else {
				return false;
			}
		}

		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + "]";
		}
	
	
	
}
