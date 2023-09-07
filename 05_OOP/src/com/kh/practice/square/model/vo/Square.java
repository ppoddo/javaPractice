package com.kh.practice.square.model.vo;

public class Square {
	private double height;
	private double width;
	private String color = "white";
	
	public Square() {}
	public Square(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public String inform() {
		return height + " " + width + " " + color +"\n";
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
