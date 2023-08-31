package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child4 extends Parent{
	public Child4() {
//		super.num = 10; // 	같은 클래스에서만 가능
//		super.dNum = 12.5; //	같은 패키지에서만 가능
		super.bool = false;	//	다른 패키지지만 상속관계이기 때문에 접근 가능
		super.ch = '나'; // public은 어디서든지 접근 가능
		
	}
}
