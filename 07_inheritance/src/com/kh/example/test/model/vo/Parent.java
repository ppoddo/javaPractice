package com.kh.example.test.model.vo;

public class Parent {
	private int num;		// 같은 클래스
	double dNum;			//default 접근제한자 같은 패키지
	protected boolean bool; // 같은패키지와 상속받은 클래스
	public char ch;			// 모든 클래스
	
	public Parent() {}
		
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	
}
