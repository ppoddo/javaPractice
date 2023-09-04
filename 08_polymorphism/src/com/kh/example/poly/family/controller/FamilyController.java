package com.kh.example.poly.family.controller;

import com.kh.example.poly.family.model.vo.Basic;
import com.kh.example.poly.family.model.vo.Family;
import com.kh.example.poly.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();	/추상 메소드는 일반 클래스에서 객체생성 불가
//		Basic b = new basic();	// 마찬가지로 인터페이스도 일반 클래스에서 안된다
		Family f = new Mother();	// 마더 객체를 담는 레퍼런스 변수에서 불러오기 == 참조한다
		Basic b = new Mother();	//마더 객체를 담는 레퍼런스 변수에서 불러오기
	}

}
