package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	
	public Child1() {
		Parent p = new Parent();
//		p.Num = 10;		// private 메소드라 접근 불가
		p.dNum = 12.3;	// default 메소드라 같은 패키지라 접근 가능
		p.bool = true;	// protected 메소드라 같은 패키지도 가능하고 상속받은 클래스에서도 가능
		p.ch = 'A';		// public 메소드라 어디서든지 접근 가능
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
