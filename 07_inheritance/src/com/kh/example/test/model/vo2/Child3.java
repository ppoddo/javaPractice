package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 {
	public Child3() {
		Parent p = new Parent();
//		p.num = 100; 	//같은 클래스 안에 있어야 접근 가능
//		p.dNum = 3.5; //같은 패키지 안에 있어야 접근 가능
//		p.bool = true; // 같은 패키지 안에 있지도 않고 상속관계도 아니므로 접근 불가능
		p.ch = '가'; 	//public 이라서 접근 가능
	}
}
