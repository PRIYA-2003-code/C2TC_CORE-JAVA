package com.tnsc.tnsc.dayeight.abstraction;

public class Rectangle extends shape {
	private float width, height;

	public Rectangle() {
		this.width = 5.0f;
		this.height = 2.0f;
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		area=width*height;		
	}
	

}
