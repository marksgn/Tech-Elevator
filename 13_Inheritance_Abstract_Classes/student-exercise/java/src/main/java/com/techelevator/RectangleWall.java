package com.techelevator;

public class RectangleWall extends Wall {

	private int height;
	private int length;

	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
	}

	@Override
	public int getArea() {
		return length * height;
	}
	
	public String toString() {
		return "TEST (" + length + "x" + height+")" + " rectangle";
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

	
	
	
	
}