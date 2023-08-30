package com.kh.example.practice3.model.vo;

public class Circle {
	public static final double PI = 3.14;
	private static int radius = 1;
	
	public void incrementRadius() {
		radius++;
		
	}
	
	public void getAreaOfCircle() {		// 원 넓이
		System.out.println("원의 넓이 : " + PI*radius*radius);
		
	}
	
	public void getSizeOfCircle() {		//원 둘레
		System.out.println("원의 둘레 : " + 2*PI*radius);
		
	}
	
}
