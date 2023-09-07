package com.kh.practice.square.controller;

import com.kh.practice.square.model.vo.Square;

public class SquareController {
	private Square s;
	
	public Square createSquare(double height, double width) {
		s = new Square(height, width);
		return s;
	}
	
	public double calcPerimeter() { //가로2 세로2
		double result = 0;
		double height = 0;
		double width = 0;
		if(s != null) {
			height = s.getHeight();
			width = s.getWidth();
		}
		if(height != 0 && width != 0) {
			result = (s.getHeight() + s.getWidth())*2;
		}
		return result;
	}
	
	public double calcArea() { //가로*세로
		double result2 = 0;
		double height = 0;
		double width = 0;
		if(s != null) {
			height = s.getHeight();
			width = s.getWidth();
		}
		if(height != 0 && width != 0) {
			result2 =  s.getHeight() * s.getWidth();
		}
		return result2;
	}
	
	public boolean paintColor(String color) {
		if(s != null && s.getHeight() != 0 && s.getWidth() != 0) {
			s.setColor(color);
			return true;
		} else {
			return false;
		}
	}

	public String print() {
		String resultP = " ";
		if(s != null && s.getHeight() != 0 && s.getWidth() != 0) {
			resultP = s.inform();
		}
		return resultP;
	}
}
