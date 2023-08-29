package com.kh.example.practice3.model.vo;

public class Circle {
	public double PI = 3.14;
	private int radius = 1;
	
	public void incrementRadius() {
		radius++;
		
	}
	
	public void getAreaOfCircle() {
		System.out.println("원의 넓이 : " + PI*radius*radius);
		
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : " + 2*PI*radius);
		
	}
	
}
