package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	
	public static void main(String[] args) {
		Circle ci = new Circle();
		
		ci.getSizeOfCircle();
		ci.getAreaOfCircle();
		
		System.out.println("반지름 1증가");
		ci.incrementRadius();
		
		ci.getSizeOfCircle();
		ci.getAreaOfCircle();
		
	}

}
