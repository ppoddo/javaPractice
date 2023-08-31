package com.kh.example.test.model.vo;

public class Child2 extends Parent{		//Parent 의 상속 관계
	private String str;
	
	public Child2() {		//객체 생성 안해도 Parent의 멤버 사용 가능
					//내 부모 객체를 가리키는 레퍼런스 super
					// 내 객체를 가리키는 레퍼런스 this
//		super.num = 10;		// 상속되었다고해서 부모클래스의 private 메소드에 접근 x
		super.dNum = 0.0;	// default 같은 패키지라서 접근 가능
		super.bool = false; // protected는 같은패키지여서 가능한데
						// 이 자식클래스가 다른 패키지에 있어도 접근 가능
		super.ch = 'b';		// public 은 어디서든지 가능
		
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
